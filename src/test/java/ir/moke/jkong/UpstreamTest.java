package ir.moke.jkong;

import com.fasterxml.jackson.core.JsonProcessingException;
import ir.moke.jkong.dto.Algorithm;
import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.UpstreamDTO;
import ir.moke.jkong.service.KongUpstream;
import ir.moke.utils.JsonUtils;
import org.junit.jupiter.api.*;

import java.net.http.HttpResponse;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class UpstreamTest extends KongTestUtils {

    @Test
    @Order(0)
    public void checkCreate() throws JsonProcessingException {
        UpstreamDTO dto = new UpstreamDTO(UPSTREAM_UUID, "upstream-test");
        HttpResponse<UpstreamDTO> response = kong.api(KongUpstream.class).create(dto);
        Assertions.assertEquals(201, response.statusCode());
    }

    @Test
    @Order(1)
    public void checkList() {
        HttpResponse<KongResponse<UpstreamDTO>> response = kong.api(KongUpstream.class).list(List.of(), null, 1);
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
        HttpResponse<UpstreamDTO> response = kong.api(KongUpstream.class).get(UPSTREAM_UUID);
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(3)
    public void checkUpdate() {
        UpstreamDTO dto = new UpstreamDTO("Changed-Name");
        HttpResponse<UpstreamDTO> response = kong.api(KongUpstream.class).update(UPSTREAM_UUID, dto);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("Changed-Name", response.body().getName());
    }

    @Test
    @Order(3)
    public void checkUpsert() {
        UpstreamDTO dto = new UpstreamDTO(UPSTREAM_UUID, "upstream-test", List.of("new_tag"), Algorithm.LATENCY);
        HttpResponse<UpstreamDTO> response = kong.api(KongUpstream.class).upsert(UPSTREAM_UUID, dto);
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(999)
    public void checkDelete() {
        HttpResponse<Void> response = kong.api(KongUpstream.class).delete(UPSTREAM_UUID);
        Assertions.assertEquals(204, response.statusCode());
    }
}
