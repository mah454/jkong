package ir.moke.jkong.dto.plugin.rate_limit;

import com.fasterxml.jackson.annotation.JsonValue;

public enum LimitBy {
    CUSTOMER("customer"),
    CUSTOMER_GROUP("customer-group"),
    CREDENTIAL("credential"),
    HEADER("header"),
    IP("ip"),
    PATH("path"),
    PRINCIPAL("principal"),
    SERVICE("service");

    private final String value;

    LimitBy(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
