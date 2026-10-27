package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Type {
    GRPC("grpc"),
    GRPCS("grpcs"),
    HTTP("http"),
    HTTPS("https"),
    TCP("tcp");

    private final String value;

    Type(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
