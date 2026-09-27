package ir.moke.jkong.service;

import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.RouteDTO;
import ir.moke.kafir.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@Header(parameters = @HeaderParameter(key = "Content-Type", value = "application/json"))
public interface KongRoute {

    @GET("/routes")
    HttpResponse<KongResponse<RouteDTO>> list(@QueryParameter("tags") List<String> tags,
                                              @QueryParameter("offset") String offset,
                                              @QueryParameter("size") Integer size);

    @POST("/routes")
    HttpResponse<KongResponse<RouteDTO>> create(RouteDTO dto);

    @DELETE("/routes/{uid}")
    HttpResponse<Void> delete(@PathParameter("uid") String uid);

    @GET("/routes/{uid}")
    HttpResponse<RouteDTO> get(@PathParameter("uid") String uid);

    @PATCH("/routes/{uid}")
    HttpResponse<RouteDTO> update(@PathParameter("uid") String uid, RouteDTO dto);

    @PUT("/routes/{uid}")
    HttpResponse<RouteDTO> upsert(@PathParameter("uid") String uid, RouteDTO dto);
}
