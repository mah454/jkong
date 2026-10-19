package ir.moke.jkong.dto.plugin.rate_limit;

import com.fasterxml.jackson.annotation.JsonProperty;
import ir.moke.jkong.dto.RouteItemDTO;
import ir.moke.jkong.dto.ServiceItemDTO;

public class RateLimitConfig {
    @JsonProperty("custom_key")
    private String customKey;
    @JsonProperty("error_code")
    private int errorCode = 429;
    @JsonProperty("error_message")
    private String errorMessage;
    @JsonProperty("fault_tolerant")
    private boolean faultTolerant = true;
    @JsonProperty("header_name")
    private String headerName;
    @JsonProperty("hide_client_headers")
    private boolean hideClientHeaders = false;
    @JsonProperty("limit_by")
    private LimitBy limitBy = LimitBy.CUSTOMER;
    private String path;
    private LimitPolicy policy;
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer hour;
    private Integer minute;
    private Integer second;
    @JsonProperty("sync_rate")
    private int syncRate = -1;
    private RouteItemDTO route;
    private ServiceItemDTO service;

    public RateLimitConfig() {
    }

    public RateLimitConfig(LimitPolicy policy, Integer minute) {
        this.policy = policy;
        this.minute = minute;
    }

    public String getCustomKey() {
        return customKey;
    }

    public void setCustomKey(String customKey) {
        this.customKey = customKey;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public boolean isFaultTolerant() {
        return faultTolerant;
    }

    public void setFaultTolerant(boolean faultTolerant) {
        this.faultTolerant = faultTolerant;
    }

    public String getHeaderName() {
        return headerName;
    }

    public void setHeaderName(String headerName) {
        this.headerName = headerName;
    }

    public boolean isHideClientHeaders() {
        return hideClientHeaders;
    }

    public void setHideClientHeaders(boolean hideClientHeaders) {
        this.hideClientHeaders = hideClientHeaders;
    }

    public LimitBy getLimitBy() {
        return limitBy;
    }

    public void setLimitBy(LimitBy limitBy) {
        this.limitBy = limitBy;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public LimitPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(LimitPolicy policy) {
        this.policy = policy;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        this.second = second;
    }

    public int getSyncRate() {
        return syncRate;
    }

    public void setSyncRate(int syncRate) {
        this.syncRate = syncRate;
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
