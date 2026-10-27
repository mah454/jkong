package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UnhealthyDTO {
    @JsonProperty("http_failures")
    private Integer httpFailures;
    @JsonProperty("http_statuses")
    private List<Integer> httpStatuses;
    @JsonProperty("interval")
    private Integer interval;
    @JsonProperty("timeouts")
    private Integer timeouts;
    @JsonProperty("tcp_failures")
    private Integer tcpFailures;

    public UnhealthyDTO() {
    }

    public UnhealthyDTO(Integer httpFailures, List<Integer> httpStatuses, Integer interval, Integer timeouts, Integer tcpFailures) {
        this.httpFailures = httpFailures;
        this.httpStatuses = httpStatuses;
        this.interval = interval;
        this.timeouts = timeouts;
        this.tcpFailures = tcpFailures;
    }

    public Integer getHttpFailures() {
        return httpFailures;
    }

    public void setHttpFailures(Integer httpFailures) {
        this.httpFailures = httpFailures;
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

    public Integer getTimeouts() {
        return timeouts;
    }

    public void setTimeouts(Integer timeouts) {
        this.timeouts = timeouts;
    }

    public Integer getTcpFailures() {
        return tcpFailures;
    }

    public void setTcpFailures(Integer tcpFailures) {
        this.tcpFailures = tcpFailures;
    }
}
