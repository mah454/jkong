### JKong
Kong api gateway java client

usage : 
```java
private static final JKong kong = new JKong("127.0.0.1", 8001);

public void sample() {
    
    /* Service management */
    // kong.api(KongService.class)

    /* Route management */
    // kong.api(KongRoute.class)
}
``` 


example code exists  : 
```text
src/test/java/ir/moke/jkong/RouteTest.java
src/test/java/ir/moke/jkong/ServiceTest.java
```