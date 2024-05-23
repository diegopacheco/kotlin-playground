### Note on Data classes

* Data classes don't play well with inheritance.
* Data classes are final by default.
* Data classes can't be abstract.
* Want flexibility use classes.
* Parameters on the base class are closed(final) by default.
```kotlin
open class Base(
    /* what is here is part of the constructor */
    /* closed by default */ val version: Int = 1,
    /* closed by default */ val name: String = "jj",
    /* closed by default */ val age: String = "40",
    /* closed by default */ val email: String = "m@m.com"
) {
    // ....
}
```

### Build
```bash
./mvnw clean install 
```