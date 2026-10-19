package ir.moke.jkong.dto.plugin.rate_limit;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ir.moke.jkong.UnixTimestampDeserializer;
import ir.moke.jkong.dto.RouteItemDTO;
import ir.moke.jkong.dto.ServiceItemDTO;

import java.time.LocalDateTime;
import java.util.List;

public class RateLimitPluginDTO {
    private String id;
    @JsonProperty("instance_name")
    private String instanceName;
    private RateLimitConfig config;

    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    private boolean enabled = true;
    private String protocol;
    private List<String> tags;

    private RouteItemDTO route;
    private ServiceItemDTO service;

    public RateLimitPluginDTO() {
    }

    public RateLimitPluginDTO(RateLimitConfig config, boolean enabled, List<String> tags, RouteItemDTO route, ServiceItemDTO service) {
        this.config = config;
        this.enabled = enabled;
        this.tags = tags;
        this.route = route;
        this.service = service;
    }

    public RateLimitPluginDTO(RateLimitConfig config, boolean enabled, List<String> tags, ServiceItemDTO service) {
        this.config = config;
        this.enabled = enabled;
        this.tags = tags;
        this.service = service;
    }

    public RateLimitPluginDTO(RateLimitConfig config, boolean enabled, ServiceItemDTO service) {
        this.config = config;
        this.enabled = enabled;
        this.service = service;
    }

    public RateLimitPluginDTO(String id, RateLimitConfig config, ServiceItemDTO service) {
        this.id = id;
        this.config = config;
        this.service = service;
    }

    public RateLimitPluginDTO(RateLimitConfig config, ServiceItemDTO service) {
        this.config = config;
        this.service = service;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return "rate-limiting";
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public RateLimitConfig getConfig() {
        return config;
    }

    public void setConfig(RateLimitConfig config) {
        this.config = config;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public RouteItemDTO getRoute() {
        return route;
    }

    public void setRoute(RouteItemDTO route) {
        this.route = route;
    }

    public ServiceItemDTO getService() {
        return service;
    }

    public void setService(ServiceItemDTO service) {
        this.service = service;
    }
}
