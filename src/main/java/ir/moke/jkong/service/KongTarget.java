package ir.moke.jkong.service;

import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.TargetDTO;
import ir.moke.kafir.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@Header(parameters = @HeaderParameter(key = "Content-Type", value = "application/json"))
public interface KongTarget {

    @GET("/upstreams/{upstreamIdOrName}/targets")
    HttpResponse<KongResponse<TargetDTO>> list(@PathParameter("upstreamIdOrName") String upstreamIdOrName,
                                               @QueryParameter("tags") List<String> tags,
                                               @QueryParameter("offset") String offset,
                                               @QueryParameter("size") Integer size);

    @POST("/upstreams/{upstreamIdOrName}/targets")
    HttpResponse<TargetDTO> create(@PathParameter("upstreamIdOrName") String upstreamIdOrName,
                                   TargetDTO dto);

    @DELETE("/upstreams/{upstreamIdOrName}/targets/{targetIdOrTarget}")
    HttpResponse<Void> delete(@PathParameter("upstreamIdOrName") String upstreamIdOrName,
                              @PathParameter("targetIdOrTarget") String targetIdOrTarget);

    @GET("/upstreams/{upstreamIdOrName}/targets/{targetIdOrTarget}")
    HttpResponse<TargetDTO> get(@PathParameter("upstreamIdOrName") String upstreamIdOrName,
                                @PathParameter("targetIdOrTarget") String targetIdOrTarget);

    @PATCH("/upstreams/{upstreamIdOrName}/targets/{targetIdOrTarget}")
    HttpResponse<TargetDTO> update(@PathParameter("upstreamIdOrName") String upstreamIdOrName,
                                   @PathParameter("targetIdOrTarget") String targetIdOrTarget,
                                   TargetDTO dto);

    @PUT("/upstreams/{upstreamIdOrName}/targets/{targetIdOrTarget}")
    HttpResponse<TargetDTO> upsert(@PathParameter("upstreamIdOrName") String upstreamIdOrName,
                                   @PathParameter("targetIdOrTarget") String targetIdOrTarget,
                                   TargetDTO dto);
}
