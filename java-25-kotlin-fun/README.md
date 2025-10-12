### Build 
```bash
./mvnw clean install 
```

### Result

Kotlin `2.3.0-Beta1` does not support JVM target version `25` YET.

```bash
[ERROR] Failed to execute goal org.jetbrains.kotlin:kotlin-maven-plugin:2.3.0-Beta1:compile (compile) on project java-25-kotlin-fun: Compilation failure
[ERROR] Unknown JVM target version: 25
[ERROR] Supported versions: 1.8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24
[ERROR]
[ERROR] -> [Help 1]
[ERROR]
```

### You can use JVM 25 but not as target, this works

```xml
<properties>
    <maven.compiler.source>25</maven.compiler.source>
    <maven.compiler.target>24</maven.compiler.target>
    <kotlin.compiler.jvmTarget>24</kotlin.compiler.jvmTarget>
    <kotlin.version>2.3.0-Beta1</kotlin.version>
</properties>
```