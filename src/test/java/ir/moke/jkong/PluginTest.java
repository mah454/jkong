package ir.moke.jkong;

import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.ServiceDTO;
import ir.moke.jkong.dto.ServiceItemDTO;
import ir.moke.jkong.dto.plugin.rate_limit.LimitPolicy;
import ir.moke.jkong.dto.plugin.rate_limit.RateLimitConfig;
import ir.moke.jkong.dto.plugin.rate_limit.RateLimitPluginDTO;
import ir.moke.jkong.service.KongRateLimitPlugin;
import ir.moke.jkong.service.KongService;
import org.junit.jupiter.api.*;

import java.net.http.HttpResponse;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PluginTest {
    private static final JKong kong = new JKong("127.0.0.1", 8001);
    private static final String SERVICE_UUID = "6b13a2bf-2a8f-47fd-9e2e-d52582748111";
    private static final String PLUGIN_UUID = "6b13a2bf-2a8f-47fd-9e2e-d525827abcde";

    @BeforeAll
    public static void initialize() {
        System.out.println("Initialize dummy service");
        ServiceDTO dto = new ServiceDTO("test", "127.0.0.1", 8080, "/api/v1/test", true, List.of("test"), SERVICE_UUID);
        HttpResponse<ServiceDTO> response = kong.api(KongService.class).create(dto);
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
    public void checkCreate() {
        RateLimitPluginDTO dto = new RateLimitPluginDTO(PLUGIN_UUID, new RateLimitConfig(LimitPolicy.LOCAL, 1), new ServiceItemDTO(SERVICE_UUID));
        HttpResponse<RateLimitPluginDTO> response = kong.api(KongRateLimitPlugin.class).create(dto);
        Assertions.assertEquals(201, response.statusCode());
    }

    @Test
    @Order(1)
    public void checkList() {
        HttpResponse<KongResponse<RateLimitPluginDTO>> response = kong.api(KongRateLimitPlugin.class).list(List.of(), null, 1);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertFalse(response.body().data().isEmpty());
    }

    @Test
    @Order(2)
    public void checkGet() {
        HttpResponse<RateLimitPluginDTO> response = kong.api(KongRateLimitPlugin.class).get(PLUGIN_UUID);
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(3)
    public void checkUpdate() {
        RateLimitPluginDTO dto = new RateLimitPluginDTO(new RateLimitConfig(LimitPolicy.LOCAL, 120), new ServiceItemDTO(SERVICE_UUID));
        HttpResponse<RateLimitPluginDTO> response = kong.api(KongRateLimitPlugin.class).update(PLUGIN_UUID, dto);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals(120, response.body().getConfig().getMinute());
    }

    @Test
    @Order(3)
    public void checkUpsert() {
        RateLimitPluginDTO dto = new RateLimitPluginDTO(new RateLimitConfig(LimitPolicy.LOCAL, 50), new ServiceItemDTO(SERVICE_UUID));
        HttpResponse<RateLimitPluginDTO> response = kong.api(KongRateLimitPlugin.class).upsert(PLUGIN_UUID, dto);
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(999)
    public void checkDelete() {
        HttpResponse<Void> response = kong.api(KongRateLimitPlugin.class).delete(PLUGIN_UUID);
        Assertions.assertEquals(204, response.statusCode());
    }
}
