package ir.moke.jkong;

import com.fasterxml.jackson.core.JsonProcessingException;
import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.ServiceDTO;
import ir.moke.jkong.service.KongService;
import ir.moke.utils.JsonUtils;
import org.junit.jupiter.api.*;

import java.net.http.HttpResponse;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ServiceTest {
    private static final JKong kong = new JKong("127.0.0.1", 8001);
    private static final String UUID = "6b13a2bf-2a8f-47fd-9e2e-d52582748def";

    @Test
    @Order(0)
    public void checkCreate() {
        ServiceDTO dto = new ServiceDTO("test", "127.0.0.1", 8080, "/api/v1/test", true, List.of("test"), UUID);
        HttpResponse<KongResponse<ServiceDTO>> response = kong.api(KongService.class).create(dto);
        Assertions.assertEquals(201, response.statusCode());
    }

    @Test
    @Order(1)
    public void checkList() {
        HttpResponse<KongResponse<ServiceDTO>> response = kong.api(KongService.class).list(List.of("test"), null, 1);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertFalse(response.body().data().isEmpty());

        try {
            System.out.println(JsonUtils.toJson(response.body()));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Order(2)
    public void checkGet() {
        HttpResponse<ServiceDTO> response = kong.api(KongService.class).get(UUID);
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(3)
    public void checkUpdate() {
        ServiceDTO dto = new ServiceDTO();
        dto.setName("Changed-Name");
        HttpResponse<ServiceDTO> response = kong.api(KongService.class).update(UUID, dto);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("Changed-Name", response.body().getName());
    }

    @Test
    @Order(3)
    public void checkUpsert() {
        ServiceDTO dto = new ServiceDTO("test2", "127.0.0.1", 8080, "/api/v1/test2", true, List.of("test2"), UUID);
        HttpResponse<ServiceDTO> response = kong.api(KongService.class).upsert(UUID, dto);

        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(999)
    public void checkDelete() {
        HttpResponse<Void> response = kong.api(KongService.class).delete(UUID);
        Assertions.assertEquals(204, response.statusCode());
    }
}
