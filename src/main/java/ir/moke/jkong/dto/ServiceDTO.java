package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ir.moke.jkong.UnixTimestampDeserializer;

import java.time.LocalDateTime;
import java.util.List;

public class ServiceDTO {
    @JsonProperty("name")
    private String name;
    @JsonProperty("protocol")
    private String protocol;
    @JsonProperty("host")
    private String host;
    @JsonProperty("port")
    private Integer port;
    @JsonProperty("path")
    private String path;
    @JsonProperty("enabled")
    private boolean enabled = true;
    @JsonProperty("tags")
    private List<String> tags;
    @JsonProperty("id")
    private String id;
    @JsonProperty("retries")
    private Integer retries;

    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("updated_at")
    private LocalDateTime updatedAt;
    @JsonDeserialize(using = UnixTimestampDeserializer.class)
    @JsonProperty("created_at")
    private LocalDateTime createdAt;

    @JsonProperty("connect_timeout")
    private Integer connectionTimeout;
    @JsonProperty("read_timeout")
    private Integer readTimeout;
    @JsonProperty("write_timeout")
    private Integer writeTimeout;

    @JsonProperty("client_certificate")
    private ClientCertificateDTO clientCertificate;
    @JsonProperty("ca_certificates")
    private List<String> caCertificates;
    @JsonProperty("tls_verify")
    private Boolean tlsVerify;
    @JsonProperty("tls_verify_depth")
    private Integer tlsVerifyDepth;

    public ServiceDTO() {
    }

    public ServiceDTO(String name, String host, Integer port, List<String> tags) {
        this.name = name;
        this.host = host;
        this.port = port;
        this.tags = tags;
    }

    public ServiceDTO(String name, String host, Integer port, List<String> tags, String id) {
        this.name = name;
        this.host = host;
        this.port = port;
        this.tags = tags;
        this.id = id;
    }

    public ServiceDTO(String name, String host, Integer port, String path, List<String> tags) {
        this.name = name;
        this.host = host;
        this.port = port;
        this.path = path;
        this.tags = tags;
    }

    public ServiceDTO(String name, String host, Integer port, String path, boolean enabled, List<String> tags, String id) {
        this.name = name;
        this.host = host;
        this.port = port;
        this.path = path;
        this.enabled = enabled;
        this.tags = tags;
        this.id = id;
    }

    public ServiceDTO(String name, String host, Integer port, String path, boolean enabled, List<String> tags) {
        this.name = name;
        this.host = host;
        this.port = port;
        this.path = path;
        this.enabled = enabled;
        this.tags = tags;
    }

    public ServiceDTO(String name, String protocol, String host, Integer port, String path, boolean enabled, List<String> tags, String id) {
        this.name = name;
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.enabled = enabled;
        this.tags = tags;
        this.id = id;
    }

    public ServiceDTO(String name, String protocol, String host, Integer port, String path, boolean enabled, List<String> tags) {
        this.name = name;
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
        this.enabled = enabled;
        this.tags = tags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
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

    public Integer getConnectionTimeout() {
        return connectionTimeout;
    }

    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Integer getWriteTimeout() {
        return writeTimeout;
    }

    public void setWriteTimeout(Integer writeTimeout) {
        this.writeTimeout = writeTimeout;
    }

    public ClientCertificateDTO getClientCertificate() {
        return clientCertificate;
    }

    public void setClientCertificate(ClientCertificateDTO clientCertificate) {
        this.clientCertificate = clientCertificate;
    }

    public List<String> getCaCertificates() {
        return caCertificates;
    }

    public void setCaCertificates(List<String> caCertificates) {
        this.caCertificates = caCertificates;
    }

    public Boolean getTlsVerify() {
        return tlsVerify;
    }

    public void setTlsVerify(Boolean tlsVerify) {
        this.tlsVerify = tlsVerify;
    }

    public Integer getTlsVerifyDepth() {
        return tlsVerifyDepth;
    }

    public void setTlsVerifyDepth(Integer tlsVerifyDepth) {
        this.tlsVerifyDepth = tlsVerifyDepth;
    }
}
