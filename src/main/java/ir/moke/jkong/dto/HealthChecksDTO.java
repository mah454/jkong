package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HealthChecksDTO {
    @JsonProperty("active")
    private ActiveDTO activeDTO;
    @JsonProperty("passive")
    private PassiveDTO passiveDTO;
    @JsonProperty("threshold")
    private Integer threshold;

    public HealthChecksDTO() {
    }

    public HealthChecksDTO(ActiveDTO activeDTO, PassiveDTO passiveDTO, Integer threshold) {
        this.activeDTO = activeDTO;
        this.passiveDTO = passiveDTO;
        this.threshold = threshold;
    }

    public ActiveDTO getActive() {
        return activeDTO;
    }

    public void setActive(ActiveDTO activeDTO) {
        this.activeDTO = activeDTO;
    }

    public PassiveDTO getPassive() {
        return passiveDTO;
    }

    public void setPassive(PassiveDTO passiveDTO) {
        this.passiveDTO = passiveDTO;
    }

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }
}
