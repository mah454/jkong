package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ir.moke.jkong.UnixTimestampDeserializer;

import java.time.LocalDateTime;
import java.util.List;

public class RouteDTO {
    @JsonProperty("response_buffering")
    private Boolean responseBuffering;
    @JsonProperty("https_redirect_status_code")
    private Integer httpsRedirectStatusCode;
    @JsonProperty("snis")
    private List<String> snis;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tags")
    private List<String> tags;
    @JsonProperty("path_handling")
    private String pathHandling;
    @JsonProperty("protocols")
    private List<String> protocols;
    @JsonProperty("id")
    private String id;
    @JsonProperty("sources")
    private List<SourceDTO> sources;
    @JsonProperty("preserve_host")
    private Boolean preserveHost;
    @JsonProperty("headers")
    private List<String> headers;
    @JsonProperty("strip_path")
    private Boolean stripPath = false;
    @JsonProperty("destinations")
    private List<DestinationDTO> destinations;
    @JsonProperty("methods")
    private List<String> methods;
    @JsonProperty("hosts")
    private List<String> hosts;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("created_at")
    private LocalDateTime createdAt;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonProperty("regex_priority")
    private Integer regexPriority;
    @JsonProperty("paths")
    private List<String> paths;
    @JsonProperty("service")
    private ServiceItemDTO service;
    @JsonProperty("request_buffering")
    private Boolean requestBuffering;

    public RouteDTO() {
    }

    public RouteDTO(String name,
                    List<String> hosts,
                    List<String> methods,
                    List<String> paths,
                    ServiceItemDTO service,
                    List<String> tags,
                    List<String> protocols,
                    Boolean stripPath) {
        this.name = name;
        this.tags = tags;
        this.protocols = protocols;
        this.stripPath = stripPath;
        this.methods = methods;
        this.hosts = hosts;
        this.paths = paths;
        this.service = service;
    }

    public RouteDTO(String name,
                    List<String> hosts,
                    List<String> paths,
                    ServiceItemDTO service,
                    List<String> tags) {
        this.name = name;
        this.tags = tags;
        this.hosts = hosts;
        this.paths = paths;
        this.service = service;
    }

    public RouteDTO(String name,
                    List<String> hosts,
                    List<String> paths,
                    ServiceItemDTO service,
                    Boolean stripPath) {
        this.name = name;
        this.stripPath = stripPath;
        this.hosts = hosts;
        this.paths = paths;
        this.service = service;
    }

    public RouteDTO(String name,
                    List<String> hosts,
                    List<String> paths,
                    ServiceItemDTO service) {
        this.name = name;
        this.hosts = hosts;
        this.paths = paths;
        this.service = service;
    }

    public Boolean getResponseBuffering() {
        return responseBuffering;
    }

    public void setResponseBuffering(Boolean responseBuffering) {
        this.responseBuffering = responseBuffering;
    }

    public Integer getHttpsRedirectStatusCode() {
        return httpsRedirectStatusCode;
    }

    public void setHttpsRedirectStatusCode(Integer httpsRedirectStatusCode) {
        this.httpsRedirectStatusCode = httpsRedirectStatusCode;
    }

    public List<String> getSnis() {
        return snis;
    }

    public void setSnis(List<String> snis) {
        this.snis = snis;
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

    public String getPathHandling() {
        return pathHandling;
    }

    public void setPathHandling(String pathHandling) {
        this.pathHandling = pathHandling;
    }

    public List<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<SourceDTO> getSources() {
        return sources;
    }

    public void setSources(List<SourceDTO> sources) {
        this.sources = sources;
    }

    public Boolean getPreserveHost() {
        return preserveHost;
    }

    public void setPreserveHost(Boolean preserveHost) {
        this.preserveHost = preserveHost;
    }

    public List<String> getHeaders() {
        return headers;
    }

    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public Boolean getStripPath() {
        return stripPath;
    }

    public void setStripPath(Boolean stripPath) {
        this.stripPath = stripPath;
    }

    public List<DestinationDTO> getDestinations() {
        return destinations;
    }

    public void setDestinations(List<DestinationDTO> destinations) {
        this.destinations = destinations;
    }

    public List<String> getMethods() {
        return methods;
    }

    public void setMethods(List<String> methods) {
        this.methods = methods;
    }

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getRegexPriority() {
        return regexPriority;
    }

    public void setRegexPriority(Integer regexPriority) {
        this.regexPriority = regexPriority;
    }

    public List<String> getPaths() {
        return paths;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public ServiceItemDTO getService() {
        return service;
    }

    public void setService(ServiceItemDTO service) {
        this.service = service;
    }

    public Boolean getRequestBuffering() {
        return requestBuffering;
    }

    public void setRequestBuffering(Boolean requestBuffering) {
        this.requestBuffering = requestBuffering;
    }
}
