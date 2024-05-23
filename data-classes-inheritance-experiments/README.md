### Note on Data classes

* One important thing to always keep in mind, kotlin is closed by default which means
  * Everything is immutable
  * Everything is final (classes and properties)
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
* Can we make immutable and at the same time have inheritance? Yes.
  * Step 1: Have an open class with open properties.
  * Step 2: Have a data class that extends the open class.
  * Step 3: The data class need to override the properties.
* Look the code files: `Base.kt` and `Data.kt`
* Check the test for evidence `PersonTest.kt`

Test output:
```
 Base.name John  Base.age 55  Base.email john@john.com  Base.version 1  Base.hidden true  Person.address NYC  Person.taxPayerNumber 123  Person.country  
```

### References

* https://stackoverflow.com/questions/44391468/can-kotlin-data-class-have-more-than-one-constructor
* https://stackoverflow.com/questions/26444145/extend-data-class-in-kotlin
* https://stackoverflow.com/questions/47359496/kotlin-data-class-copy-method-not-deep-copying-all-members
* https://kotlinlang.org/docs/data-classes.html#copying

### Build
```bash
./mvnw clean install 
```