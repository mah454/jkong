package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ir.moke.jkong.UnixTimestampDeserializer;

import java.time.LocalDateTime;
import java.util.List;

public class TargetDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("tags")
    private List<String> tags;
    @JsonProperty("failover")
    private Boolean failover;
    @JsonProperty("target")
    private String target;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("upstream")
    private UpstreamItemDTO upstream;
    @JsonProperty("weight")
    private Integer weight;

    public TargetDTO() {
    }

    public TargetDTO(String id, List<String> tags, String target, UpstreamItemDTO upstream, Integer weight) {
        this.id = id;
        this.tags = tags;
        this.target = target;
        this.upstream = upstream;
        this.weight = weight;
    }

    public TargetDTO(List<String> tags, String target, UpstreamItemDTO upstream, Integer weight) {
        this.tags = tags;
        this.target = target;
        this.upstream = upstream;
        this.weight = weight;
    }

    public TargetDTO(String id, String target, UpstreamItemDTO upstream, Integer weight) {
        this.id = id;
        this.target = target;
        this.upstream = upstream;
        this.weight = weight;
    }

    public TargetDTO(String target, UpstreamItemDTO upstream, Integer weight) {
        this.target = target;
        this.upstream = upstream;
        this.weight = weight;
    }

    public TargetDTO(String id, String target, UpstreamItemDTO upstream) {
        this.id = id;
        this.target = target;
        this.upstream = upstream;
    }

    public TargetDTO(String target, UpstreamItemDTO upstream) {
        this.target = target;
        this.upstream = upstream;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Boolean getFailover() {
        return failover;
    }

    public void setFailover(Boolean failover) {
        this.failover = failover;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
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

    public UpstreamItemDTO getUpstream() {
        return upstream;
    }

    public void setUpstream(UpstreamItemDTO upstream) {
        this.upstream = upstream;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
