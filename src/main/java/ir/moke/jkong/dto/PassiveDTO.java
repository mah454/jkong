package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PassiveDTO {
    @JsonProperty("healthy")
    private HealthyDTO healthyDTO;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("unhealthy")
    private UnhealthyDTO unhealthyDTO;

    public PassiveDTO() {
    }

    public PassiveDTO(HealthyDTO healthyDTO, Type type, UnhealthyDTO unhealthyDTO) {
        this.healthyDTO = healthyDTO;
        this.type = type;
        this.unhealthyDTO = unhealthyDTO;
    }

    public HealthyDTO getHealthy() {
        return healthyDTO;
    }

    public void setHealthy(HealthyDTO healthyDTO) {
        this.healthyDTO = healthyDTO;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public UnhealthyDTO getUnhealthy() {
        return unhealthyDTO;
    }

    public void setUnhealthy(UnhealthyDTO unhealthyDTO) {
        this.unhealthyDTO = unhealthyDTO;
    }
}
