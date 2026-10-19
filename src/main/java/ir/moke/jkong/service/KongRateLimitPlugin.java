package ir.moke.jkong.service;

import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.plugin.rate_limit.RateLimitPlugin;
import ir.moke.kafir.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@Header(parameters = @HeaderParameter(key = "Content-Type", value = "application/json"))
public interface KongRateLimitPlugin {

    @GET("/plugins")
    HttpResponse<KongResponse<RateLimitPlugin>> list(@QueryParameter("tags") List<String> tags,
                                                     @QueryParameter("offset") String offset,
                                                     @QueryParameter("size") Integer size);

    @POST("/plugins")
    HttpResponse<RateLimitPlugin> create(RateLimitPlugin dto);

    @DELETE("/plugins/{PluginId}")
    HttpResponse<Void> delete(@PathParameter("PluginId") String PluginId);

    @GET("/plugins/{PluginId}")
    HttpResponse<RateLimitPlugin> get(@PathParameter("PluginId") String PluginId);

    @PATCH("/plugins/{PluginId}")
    HttpResponse<RateLimitPlugin> update(@PathParameter("PluginId") String PluginId, RateLimitPlugin dto);

    @PUT("/plugins/{PluginId}")
    HttpResponse<RateLimitPlugin> upsert(@PathParameter("PluginId") String PluginId, RateLimitPlugin dto);
}
