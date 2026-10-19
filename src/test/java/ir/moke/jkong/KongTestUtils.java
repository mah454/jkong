package ir.moke.jkong;

import ir.moke.jkong.dto.RouteDTO;
import ir.moke.jkong.dto.ServiceDTO;
import ir.moke.jkong.dto.ServiceItemDTO;
import ir.moke.jkong.service.KongRoute;
import ir.moke.jkong.service.KongService;

import java.util.List;

public class KongTestUtils {

    public static final JKong kong = new JKong("127.0.0.1", 8001);
    public static final String SERVICE_UUID = "6b13a2bf-2a8f-47fd-9e2e-d52582748111";
    public static final String PLUGIN_UUID = "098f387e-338b-427b-9aaa-efd0dcced222";
    public static final String ROUTE_UUID = "c0677aff-877e-4626-8630-53b830d1e333";

    public static void kongStartUp() {
        System.out.println("Initialize dummy service");
        ServiceDTO dto = new ServiceDTO(SERVICE_UUID, "test", "172.17.0.1", 8080, List.of("test"));
        kong.api(KongService.class).create(dto);


        System.out.println("Initialize dummy route");
        RouteDTO routeDTO = new RouteDTO(ROUTE_UUID, "test", List.of("/api/a"), List.of("users"), new ServiceItemDTO(SERVICE_UUID));
        kong.api(KongRoute.class).create(routeDTO);
    }

    public static void kongCleanUp() {
        System.out.println("Remove dummy route");
        kong.api(KongRoute.class).delete(ROUTE_UUID);

        System.out.println("Remove dummy service");
        kong.api(KongService.class).delete(SERVICE_UUID);
    }

    static void main() {
        kongStartUp();
        kongCleanUp();
    }
}
