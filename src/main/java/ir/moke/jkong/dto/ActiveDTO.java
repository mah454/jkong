package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ActiveDTO {
    @JsonProperty("concurrency")
    private Integer concurrency;
    @JsonProperty("headers")
    private Object headers;
    @JsonProperty("healthy")
    private HealthyDTO healthyDTO;
    @JsonProperty("http_path")
    private String httpPath;
    @JsonProperty("https_sni")
    private String httpsSni;
    @JsonProperty("https_verify_certificate")
    private Boolean httpsVerifyCertificate;
    @JsonProperty("timeout")
    private Integer timeout;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("unhealthy")
    private UnhealthyDTO unhealthyDTO;

    public ActiveDTO() {
    }

    public ActiveDTO(Integer concurrency, Object headers, HealthyDTO healthyDTO, String httpPath, String httpsSni, Boolean httpsVerifyCertificate, Integer timeout, Type type, UnhealthyDTO unhealthyDTO) {
        this.concurrency = concurrency;
        this.headers = headers;
        this.healthyDTO = healthyDTO;
        this.httpPath = httpPath;
        this.httpsSni = httpsSni;
        this.httpsVerifyCertificate = httpsVerifyCertificate;
        this.timeout = timeout;
        this.type = type;
        this.unhealthyDTO = unhealthyDTO;
    }

    public Integer getConcurrency() {
        return concurrency;
    }

    public void setConcurrency(Integer concurrency) {
        this.concurrency = concurrency;
    }

    public Object getHeaders() {
        return headers;
    }

    public void setHeaders(Object headers) {
        this.headers = headers;
    }

    public HealthyDTO getHealthy() {
        return healthyDTO;
    }

    public void setHealthy(HealthyDTO healthyDTO) {
        this.healthyDTO = healthyDTO;
    }

    public String getHttpPath() {
        return httpPath;
    }

    public void setHttpPath(String httpPath) {
        this.httpPath = httpPath;
    }

    public String getHttpsSni() {
        return httpsSni;
    }

    public void setHttpsSni(String httpsSni) {
        this.httpsSni = httpsSni;
    }

    public Boolean getHttpsVerifyCertificate() {
        return httpsVerifyCertificate;
    }

    public void setHttpsVerifyCertificate(Boolean httpsVerifyCertificate) {
        this.httpsVerifyCertificate = httpsVerifyCertificate;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
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
