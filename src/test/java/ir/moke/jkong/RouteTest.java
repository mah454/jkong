package ir.moke.jkong;

import com.fasterxml.jackson.core.JsonProcessingException;
import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.RouteDTO;
import ir.moke.jkong.dto.ServiceDTO;
import ir.moke.jkong.dto.ServiceItemDTO;
import ir.moke.jkong.service.KongRoute;
import ir.moke.jkong.service.KongService;
import ir.moke.utils.JsonUtils;
import org.junit.jupiter.api.*;

import java.net.http.HttpResponse;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RouteTest {
    private static final JKong kong = new JKong("127.0.0.1", 8001);
    private static final String SERVICE_UUID = "6b13a2bf-2a8f-47fd-9e2e-d52582748111";
    private static String ROUTE_UUID;

    @BeforeAll
    public static void initialize() {
        System.out.println("Initialize dummy service");
        ServiceDTO dto = new ServiceDTO("test", "127.0.0.1", 8080, "/api/v1/test", true, List.of("test"), SERVICE_UUID);
        HttpResponse<KongResponse<ServiceDTO>> response = kong.api(KongService.class).create(dto);
        Assertions.assertEquals(201, response.statusCode());
    }

    @AfterAll
    public static void shutdown() {
        System.out.println("Remove dummy service");
        HttpResponse<Void> response = kong.api(KongService.class).delete(SERVICE_UUID);
        Assertions.assertEquals(204, response.statusCode());
    }

    @Test
    @Order(0)
    public void checkCreate() throws JsonProcessingException {
        RouteDTO dto = new RouteDTO("test", List.of("localhost"), List.of("/api/sample"), new ServiceItemDTO(SERVICE_UUID), List.of("test", "T1", "T2"));
        System.out.println(JsonUtils.toJson(dto));
        HttpResponse<KongResponse<RouteDTO>> response = kong.api(KongRoute.class).create(dto);
        Assertions.assertEquals(201, response.statusCode());
    }

    @Test
    @Order(1)
    public void checkList() {
        HttpResponse<KongResponse<RouteDTO>> response = kong.api(KongRoute.class).list(List.of("test"), null, 1);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertFalse(response.body().data().isEmpty());

        ROUTE_UUID = response.body().data().getFirst().getId();

        try {
            System.out.println(JsonUtils.toJson(response.body()));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Order(2)
    public void checkGet() {
        HttpResponse<RouteDTO> response = kong.api(KongRoute.class).get(ROUTE_UUID);
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(3)
    public void checkUpdate() {
        RouteDTO dto = new RouteDTO();
        dto.setName("Changed-Name");
        HttpResponse<RouteDTO> response = kong.api(KongRoute.class).update(ROUTE_UUID, dto);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("Changed-Name", response.body().getName());
    }

    @Test
    @Order(3)
    public void checkUpsert() {
        RouteDTO dto = new RouteDTO("test2", List.of("other"), List.of("/api/new-path"), new ServiceItemDTO(SERVICE_UUID), List.of("test", "T4", "T5"));
        HttpResponse<RouteDTO> response = kong.api(KongRoute.class).upsert(ROUTE_UUID, dto);

        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(999)
    public void checkDelete() {
        HttpResponse<Void> response = kong.api(KongRoute.class).delete(ROUTE_UUID);
        Assertions.assertEquals(204, response.statusCode());
    }
}
