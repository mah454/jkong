package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ir.moke.jkong.UnixTimestampDeserializer;

import java.time.LocalDateTime;
import java.util.List;

public class UpstreamDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tags")
    private List<String> tags;
    @JsonProperty("algorithm")
    private Algorithm algorithm = Algorithm.ROUND_ROBIN;
    @JsonProperty("client_certificate")
    private ClientCertificateDTO clientCertificate;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonProperty("hash_fallback")
    private HashFallback hashFallback;
    @JsonProperty("hash_fallback_header")
    private String hashFallbackHeader;
    @JsonProperty("hash_fallback_query_arg")
    private String hashFallbackQueryArg;
    @JsonProperty("hash_on")
    private HashOn hashOn;
    @JsonProperty("hash_on_cookie")
    private String hashOnCookie;
    @JsonProperty("hash_on_header")
    private String hashOnHeader;
    @JsonProperty("hash_on_query_arg")
    private String hashOnQueryArg;
    @JsonProperty("hash_on_uri_capture")
    private String hashOnUriCapture;
    @JsonProperty("healthchecks")
    private HealthChecksDTO healthChecksDTO;
    @JsonProperty("host_header")
    private String hostHeader;
    @JsonProperty("slots")
    private Integer slots;
    @JsonProperty("sticky_sessions_cookie")
    private String stickySessionsCookie;
    @JsonProperty("sticky_sessions_cookie_path")
    private String stickySessionsCookiePath;
    @JsonProperty("use_srv_name")
    private Boolean useSrvName;

    public UpstreamDTO() {
    }

    public UpstreamDTO(String name) {
        this.name = name;
    }

    public UpstreamDTO(String name, Algorithm algorithm) {
        this.name = name;
        this.algorithm = algorithm;
    }

    public UpstreamDTO(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public UpstreamDTO(String id, String name, Algorithm algorithm) {
        this.id = id;
        this.name = name;
        this.algorithm = algorithm;
    }

    public UpstreamDTO(String id, String name, List<String> tags, Algorithm algorithm) {
        this.id = id;
        this.name = name;
        this.tags = tags;
        this.algorithm = algorithm;
    }

    public UpstreamDTO(String name, List<String> tags) {
        this.name = name;
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public ClientCertificateDTO getClientCertificate() {
        return clientCertificate;
    }

    public void setClientCertificate(ClientCertificateDTO clientCertificate) {
        this.clientCertificate = clientCertificate;
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

    public HashFallback getHashFallback() {
        return hashFallback;
    }

    public void setHashFallback(HashFallback hashFallback) {
        this.hashFallback = hashFallback;
    }

    public String getHashFallbackHeader() {
        return hashFallbackHeader;
    }

    public void setHashFallbackHeader(String hashFallbackHeader) {
        this.hashFallbackHeader = hashFallbackHeader;
    }

    public String getHashFallbackQueryArg() {
        return hashFallbackQueryArg;
    }

    public void setHashFallbackQueryArg(String hashFallbackQueryArg) {
        this.hashFallbackQueryArg = hashFallbackQueryArg;
    }

    public HashOn getHashOn() {
        return hashOn;
    }

    public void setHashOn(HashOn hashOn) {
        this.hashOn = hashOn;
    }

    public String getHashOnCookie() {
        return hashOnCookie;
    }

    public void setHashOnCookie(String hashOnCookie) {
        this.hashOnCookie = hashOnCookie;
    }

    public String getHashOnHeader() {
        return hashOnHeader;
    }

    public void setHashOnHeader(String hashOnHeader) {
        this.hashOnHeader = hashOnHeader;
    }

    public String getHashOnQueryArg() {
        return hashOnQueryArg;
    }

    public void setHashOnQueryArg(String hashOnQueryArg) {
        this.hashOnQueryArg = hashOnQueryArg;
    }

    public String getHashOnUriCapture() {
        return hashOnUriCapture;
    }

    public void setHashOnUriCapture(String hashOnUriCapture) {
        this.hashOnUriCapture = hashOnUriCapture;
    }

    public HealthChecksDTO getHealthChecks() {
        return healthChecksDTO;
    }

    public void setHealthChecks(HealthChecksDTO healthChecksDTO) {
        this.healthChecksDTO = healthChecksDTO;
    }

    public String getHostHeader() {
        return hostHeader;
    }

    public void setHostHeader(String hostHeader) {
        this.hostHeader = hostHeader;
    }

    public Integer getSlots() {
        return slots;
    }

    public void setSlots(Integer slots) {
        this.slots = slots;
    }

    public String getStickySessionsCookie() {
        return stickySessionsCookie;
    }

    public void setStickySessionsCookie(String stickySessionsCookie) {
        this.stickySessionsCookie = stickySessionsCookie;
    }

    public String getStickySessionsCookiePath() {
        return stickySessionsCookiePath;
    }

    public void setStickySessionsCookiePath(String stickySessionsCookiePath) {
        this.stickySessionsCookiePath = stickySessionsCookiePath;
    }

    public Boolean getUseSrvName() {
        return useSrvName;
    }

    public void setUseSrvName(Boolean useSrvName) {
        this.useSrvName = useSrvName;
    }
}
