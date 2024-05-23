### Build 
```bash
./mvnw clean install 
```
### Note on Java 22 (22.MAY.2024)

It works on IntelliJ idea but looks like java compiler plugin is not ready to java 22 yet.

```
[WARNING] File encoding has not been set, using platform encoding UTF-8, i.e. build is platform dependent!
[INFO] Compiling 1 source file with javac [debug release 22] to target/classes
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  7.543 s
[INFO] Finished at: 2024-05-22T21:07:09-07:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-compiler-plugin:3.13.0:compile (java-compile) on project kotlin-2-spring-boot-3.x: Fatal error compiling: error: release version 22 not supported -> [Help 1]
```
