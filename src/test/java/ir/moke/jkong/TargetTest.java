package ir.moke.jkong;

import com.fasterxml.jackson.core.JsonProcessingException;
import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.TargetDTO;
import ir.moke.jkong.dto.UpstreamDTO;
import ir.moke.jkong.dto.UpstreamItemDTO;
import ir.moke.jkong.service.KongTarget;
import ir.moke.jkong.service.KongUpstream;
import ir.moke.utils.JsonUtils;
import org.junit.jupiter.api.*;

import java.net.http.HttpResponse;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TargetTest extends KongTestUtils {

    @Test
    @Order(0)
    public void createUpstream() {
        UpstreamDTO dto = new UpstreamDTO(UPSTREAM_UUID, "upstream-test");
        HttpResponse<UpstreamDTO> response = kong.api(KongUpstream.class).create(dto);
        Assertions.assertEquals(201, response.statusCode());
    }

    @Test
    @Order(1)
    public void checkCreate() {
        TargetDTO dto = new TargetDTO(TARGET_UUID, "20.20.20.12:9091", new UpstreamItemDTO(UPSTREAM_UUID));
        HttpResponse<TargetDTO> response = kong.api(KongTarget.class).create(UPSTREAM_UUID, dto);
        Assertions.assertEquals(201, response.statusCode());
    }

    @Test
    @Order(2)
    public void checkList() {
        HttpResponse<KongResponse<TargetDTO>> response = kong.api(KongTarget.class).list(UPSTREAM_UUID, List.of(), null, 1);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertFalse(response.body().data().isEmpty());

        try {
            System.out.println(JsonUtils.toJson(response.body()));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    @Order(3)
    public void checkGet() {
        HttpResponse<TargetDTO> response = kong.api(KongTarget.class).get(UPSTREAM_UUID, TARGET_UUID);
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(4)
    public void checkUpdate() {
        TargetDTO dto = new TargetDTO("20.20.20.12:8080", new UpstreamItemDTO(UPSTREAM_UUID));
        HttpResponse<TargetDTO> response = kong.api(KongTarget.class).update(UPSTREAM_UUID, TARGET_UUID, dto);
        Assertions.assertEquals(200, response.statusCode());
        Assertions.assertEquals("20.20.20.12:8080", response.body().getTarget());
    }

    @Test
    @Order(5)
    public void checkUpsert() {
        TargetDTO dto = new TargetDTO("20.20.20.12:2021", new UpstreamItemDTO(UPSTREAM_UUID));
        HttpResponse<TargetDTO> response = kong.api(KongTarget.class).upsert(UPSTREAM_UUID, TARGET_UUID, dto);
        Assertions.assertEquals(200, response.statusCode());
    }

    @Test
    @Order(999)
    public void checkDelete() {
        HttpResponse<Void> response = kong.api(KongUpstream.class).delete(UPSTREAM_UUID);
        Assertions.assertEquals(204, response.statusCode());
    }
}
