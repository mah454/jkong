package ir.moke.jkong.dto.plugin.rate_limit;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LimitPolicy {
    CLUSTER("cluster"),
    LOCAL("local"),
    REDIS("redis");

    private final String value;

    LimitPolicy(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
