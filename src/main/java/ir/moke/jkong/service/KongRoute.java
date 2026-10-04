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
                                              @QueryParameter("offset") Integer offset,
                                              @QueryParameter("size") Integer size);

    @POST("/routes")
    HttpResponse<RouteDTO> create(RouteDTO dto);

    @DELETE("/routes/{routeIdOrName}")
    HttpResponse<Void> delete(@PathParameter("routeIdOrName") String routeIdOrName);

    @GET("/routes/{routeIdOrName}")
    HttpResponse<RouteDTO> get(@PathParameter("routeIdOrName") String routeIdOrName);

    @PATCH("/routes/{routeIdOrName}")
    HttpResponse<RouteDTO> update(@PathParameter("routeIdOrName") String routeIdOrName,
                                  RouteDTO dto);

    @PUT("/routes/{routeIdOrName}")
    HttpResponse<RouteDTO> upsert(@PathParameter("routeIdOrName") String routeIdOrName,
                                  RouteDTO dto);

    @GET("/services/{serviceIdOrName}/routes")
    HttpResponse<KongResponse<RouteDTO>> list(@PathParameter("serviceIdOrName") String serviceIdOrName,
                                              @QueryParameter("tags") List<String> tags,
                                              @QueryParameter("offset") Integer offset,
                                              @QueryParameter("size") Integer size);

    @POST("/services/{serviceIdOrName")
    HttpResponse<RouteDTO> create(@PathParameter("serviceIdOrName") String serviceIdOrName,
                                  RouteDTO dto);

    @DELETE("/services/{serviceIdOrName}/routes/{routeIdOrName}")
    HttpResponse<Void> delete(@PathParameter("serviceIdOrName") String serviceIdOrName,
                              @PathParameter("routeIdOrName") String routeIdOrName);

    @GET("/services/{serviceIdOrName}/routes/{routeIdOrName}")
    HttpResponse<RouteDTO> get(@PathParameter("serviceIdOrName") String serviceIdOrName,
                               @PathParameter("routeIdOrName") String routeIdOrName);

    @PATCH("/services/{serviceIdOrName}/routes/{routeIdOrName}")
    HttpResponse<RouteDTO> update(@PathParameter("serviceIdOrName") String serviceIdOrName,
                                  @PathParameter("routeIdOrName") String routeIdOrName,
                                  RouteDTO dto);

    @PUT("/services/{serviceIdOrName}/routes/{routeIdOrName}")
    HttpResponse<RouteDTO> upsert(@PathParameter("serviceIdOrName") String serviceIdOrName,
                                  @PathParameter("routeIdOrName") String routeIdOrName,
                                  RouteDTO dto);
}
