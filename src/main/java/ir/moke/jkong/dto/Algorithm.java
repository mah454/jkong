package ir.moke.jkong.dto;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Algorithm {
    CONSISTENT_HASHING("consistent-hashing"),
    LATENCY("latency"),
    LEAST_CONNECTIONS("least-connections"),
    ROUND_ROBIN("round-robin"),
    STICKY_SESSIONS("sticky-sessions");

    private final String value;

    Algorithm(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
