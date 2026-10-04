package ir.moke.jkong.service;

import ir.moke.jkong.dto.KongResponse;
import ir.moke.jkong.dto.ServiceDTO;
import ir.moke.kafir.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@Header(parameters = @HeaderParameter(key = "Content-Type", value = "application/json"))
public interface KongService {

    @GET("/services")
    HttpResponse<KongResponse<ServiceDTO>> list(@QueryParameter("tags") List<String> tags,
                                                @QueryParameter("offset") String offset,
                                                @QueryParameter("size") Integer size);

    @POST("/services")
    HttpResponse<ServiceDTO> create(ServiceDTO dto);

    @DELETE("/services/{serviceIdOrName}")
    HttpResponse<Void> delete(@PathParameter("serviceIdOrName") String serviceIdOrName);

    @GET("/services/{serviceIdOrName}")
    HttpResponse<ServiceDTO> get(@PathParameter("serviceIdOrName") String serviceIdOrName);

    @PATCH("/services/{serviceIdOrName}")
    HttpResponse<ServiceDTO> update(@PathParameter("serviceIdOrName") String serviceIdOrName, ServiceDTO dto);

    @PUT("/services/{serviceIdOrName}")
    HttpResponse<ServiceDTO> upsert(@PathParameter("serviceIdOrName") String serviceIdOrName, ServiceDTO dto);
}
