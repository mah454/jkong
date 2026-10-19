package ir.moke.jkong.service;

import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.plugin.rate_limit.RateLimitPluginDTO;
import ir.moke.kafir.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@Header(parameters = @HeaderParameter(key = "Content-Type", value = "application/json"))
public interface KongRateLimitPlugin {

    @GET("/plugins")
    HttpResponse<KongResponse<RateLimitPluginDTO>> list(@QueryParameter("tags") List<String> tags,
                                                        @QueryParameter("offset") String offset,
                                                        @QueryParameter("size") Integer size);

    @POST("/plugins")
    HttpResponse<RateLimitPluginDTO> create(RateLimitPluginDTO dto);

    @DELETE("/plugins/{PluginId}")
    HttpResponse<Void> delete(@PathParameter("PluginId") String PluginId);

    @GET("/plugins/{PluginId}")
    HttpResponse<RateLimitPluginDTO> get(@PathParameter("PluginId") String PluginId);

    @PATCH("/plugins/{PluginId}")
    HttpResponse<RateLimitPluginDTO> update(@PathParameter("PluginId") String PluginId, RateLimitPluginDTO dto);

    @PUT("/plugins/{PluginId}")
    HttpResponse<RateLimitPluginDTO> upsert(@PathParameter("PluginId") String PluginId, RateLimitPluginDTO dto);
}
