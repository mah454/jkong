package ir.moke.jkong.service;

import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.UpstreamDTO;
import ir.moke.kafir.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@Header(parameters = @HeaderParameter(key = "Content-Type", value = "application/json"))
public interface KongUpstream {

    @GET("/upstreams")
    HttpResponse<KongResponse<UpstreamDTO>> list(@QueryParameter("tags") List<String> tags,
                                                 @QueryParameter("offset") String offset,
                                                 @QueryParameter("size") Integer size);

    @POST("/upstreams")
    HttpResponse<UpstreamDTO> create(UpstreamDTO dto);

    @DELETE("/upstreams/{upstreamIdOrName}")
    HttpResponse<Void> delete(@PathParameter("upstreamIdOrName") String upstreamIdOrName);

    @GET("/upstreams/{upstreamIdOrName}")
    HttpResponse<UpstreamDTO> get(@PathParameter("upstreamIdOrName") String upstreamIdOrName);

    @PATCH("/upstreams/{upstreamIdOrName}")
    HttpResponse<UpstreamDTO> update(@PathParameter("upstreamIdOrName") String upstreamIdOrName, UpstreamDTO dto);

    @PUT("/upstreams/{upstreamIdOrName}")
    HttpResponse<UpstreamDTO> upsert(@PathParameter("upstreamIdOrName") String upstreamIdOrName, UpstreamDTO dto);
}
