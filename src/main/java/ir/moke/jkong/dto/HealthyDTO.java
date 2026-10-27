package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HealthyDTO {
    @JsonProperty("http_statuses")
    private List<Integer> httpStatuses;
    @JsonProperty("interval")
    private Integer interval;
    @JsonProperty("successes")
    private Integer successes;

    public HealthyDTO() {
    }

    public HealthyDTO(List<Integer> httpStatuses, Integer interval, Integer successes) {
        this.httpStatuses = httpStatuses;
        this.interval = interval;
        this.successes = successes;
    }

    public List<Integer> getHttpStatuses() {
        return httpStatuses;
    }

    public void setHttpStatuses(List<Integer> httpStatuses) {
        this.httpStatuses = httpStatuses;
    }

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getSuccesses() {
        return successes;
    }

    public void setSuccesses(Integer successes) {
        this.successes = successes;
    }
}
