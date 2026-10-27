package ir.moke.jkong.dto;

public enum HashFallback {
    CONSUMER("consumer"),
    COOKIE("cookie"),
    HEADER("header"),
    IP("ip"),
    NONE("none"),
    PATH("path"),
    QUERY_ARG("query_arg"),
    URI_CAPTURE("uri_capture");

    private final String value;

    HashFallback(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
