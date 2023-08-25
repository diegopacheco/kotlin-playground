### Build 
```bash
./mvnw clean install 
```
### Executable Jar
```bash
mvn clean install package
```
```bash
java -jar target/spring-boot-3.1-spring-data-jdbc-fun-1.0-SNAPSHOT-exec.jar
```
### Run
```bash
./mvnw spring-boot:run
```
```

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.2)

2023-08-25T00:20:10.849-07:00  INFO 61885 --- [           main] c.g.d.kotlin.spring.data.ApplicationKt   : Starting ApplicationKt using Java 19.0.2 with PID 61885 (/mnt/e35d88d4-42b9-49ea-bf29-c4c3b018d429/diego/git/diegopacheco/kotlin-playground/spring-boot-3.1-spring-data-jdbc-fun/target/classes started by diego in /mnt/e35d88d4-42b9-49ea-bf29-c4c3b018d429/diego/git/diegopacheco/kotlin-playground/spring-boot-3.1-spring-data-jdbc-fun)
2023-08-25T00:20:10.853-07:00  INFO 61885 --- [           main] c.g.d.kotlin.spring.data.ApplicationKt   : No active profile set, falling back to 1 default profile: "default"
2023-08-25T00:20:11.826-07:00  INFO 61885 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JDBC repositories in DEFAULT mode.
2023-08-25T00:20:11.934-07:00  INFO 61885 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 104 ms. Found 1 JDBC repository interfaces.
2023-08-25T00:20:12.284-07:00  INFO 61885 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2023-08-25T00:20:12.446-07:00  INFO 61885 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:h2db-authors user=SA
2023-08-25T00:20:12.447-07:00  INFO 61885 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2023-08-25T00:20:13.064-07:00  INFO 61885 --- [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 8080
2023-08-25T00:20:13.072-07:00  INFO 61885 --- [           main] c.g.d.kotlin.spring.data.ApplicationKt   : Started ApplicationKt in 2.517 seconds (process running for 2.771)
```
### List All Authors
```
http://localhost:8080/all
```
```
// 20230825104102
// http://localhost:8080/all

[
  {
    "id": "851b8b5c-0636-4849-92c5-807c0e40f9ed",
    "name": "Diego",
    "lastName": "Pacheco",
    "book": "Building Applications with Scala"
  },
  {
    "id": "ba40a659-2fdf-4b58-b2d9-63fef106148e",
    "name": "Diego",
    "lastName": "Pacheco",
    "book": "Building Applications with Scala"
  },
  {
    "id": "d8a75999-f8b9-404f-a5f1-9324606e606f",
    "name": "Diego",
    "lastName": "Pacheco",
    "book": "Building Applications with Scala"
  },
  {
    "id": "5a1c924b-b6d7-4209-bb73-ed4c9c1fd46f",
    "name": "Diego",
    "lastName": "Pacheco",
    "book": "Building Applications with Scala"
  },
  {
    "id": "01ef065e-941d-4abb-8659-8e05e3170b7f",
    "name": "Diego",
    "lastName": "Pacheco",
    "book": "Building Applications with Scala"
  },
  {
    "id": "eeabb8ba-910e-4205-8ff4-eaab5d22bc1d",
    "name": "Diego",
    "lastName": "Pacheco",
    "book": "Building Applications with Scala"
  },
  {
    "id": "6a694914-2e8e-4c7b-828f-9ef76759cc64",
    "name": "Diego",
    "lastName": "Pacheco",
    "book": "Building Applications with Scala"
  },
  {
    "id": "99dc1843-9fd3-4925-9ee2-cae07b9aeb2c",
    "name": "Diego",
    "lastName": "Pacheco",
    "book": "Building Applications with Scala"
  }
]
```