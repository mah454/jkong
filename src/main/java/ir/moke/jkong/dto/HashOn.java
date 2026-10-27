package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum HashOn {
    CONSUMER("consumer"),
    COOKIE("cookie"),
    HEADER("header"),
    IP("ip"),
    NONE("none"),
    PATH("path"),
    QUERY_ARG("query_arg"),
    URI_CAPTURE("uri_capture");

    private final String value;

    HashOn(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
