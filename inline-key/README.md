### Rationale

What's going on here?

`@JvmInline` value class ConfigKey <br/>
It's a Kotlin feature that wraps a primitive type (String) 
while avoiding the overhead of creating a full object
at runtime. The @JvmInline annotation tells the
compiler that this class should be compiled
to its underlying type where possible.

### Build 

```bash
./mvnw clean install 
```
