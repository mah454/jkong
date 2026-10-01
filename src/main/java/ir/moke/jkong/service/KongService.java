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

    @DELETE("/services/{uid}")
    HttpResponse<Void> delete(@PathParameter("uid") String uid);

    @GET("/services/{uid}")
    HttpResponse<ServiceDTO> get(@PathParameter("uid") String uid);

    @PATCH("/services/{uid}")
    HttpResponse<ServiceDTO> update(@PathParameter("uid") String uid, ServiceDTO dto);

    @PUT("/services/{uid}")
    HttpResponse<ServiceDTO> upsert(@PathParameter("uid") String uid, ServiceDTO dto);
}
