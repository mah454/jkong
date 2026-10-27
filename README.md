### JKong

Kong api gateway java client

usage :

```java
import ir.moke.jkong.service.KongRateLimitPlugin;

private static final JKong kong = new JKong("127.0.0.1", 8001);

public void sample() {

    /* Service */
    // kong.api(KongService.class)

    /* Route */
    // kong.api(KongRoute.class)

    /* Rate Limiting */
    // kong.api(KongRateLimitPlugin.class);

    /* Upstream */
    // kong.api(KongUpstream.class);

    /* Target */
    // kong.api(KongTarget.class);
}
``` 

example code exists  :

```text
src/test/java/ir/moke/jkong/KongTestUtils.java
src/test/java/ir/moke/jkong/PluginTest.java
src/test/java/ir/moke/jkong/RouteTest.java
src/test/java/ir/moke/jkong/ServiceTest.java
src/test/java/ir/moke/jkong/TargetTest.java
src/test/java/ir/moke/jkong/UpstreamTest.java
```