package ir.moke.jkong;

import ir.moke.kafir.http.Kafir;

import javax.net.ssl.SSLContext;
import java.net.http.HttpClient;
import java.util.Optional;

public class JKong {
    private static final String baseURL = "http://%s:%s";

    private final String host;
    private final int port;
    private final SSLContext sslContext;

    public JKong(String host, int port) {
        this.host = host;
        this.port = port;
        this.sslContext = null;
    }

    public JKong(String host, int port, SSLContext sslContext) {
        this.host = host;
        this.port = port;
        this.sslContext = sslContext;
    }

    public <T> T api(Class<T> clazz) {
        Kafir.KafirBuilder kafirBuilder = new Kafir.KafirBuilder().setBaseUri(baseURL.formatted(host, port)).setVersion(HttpClient.Version.HTTP_2);
        Optional.ofNullable(sslContext).ifPresent(item -> kafirBuilder.setSslContext(sslContext));

        return kafirBuilder.build(clazz);
    }
}
