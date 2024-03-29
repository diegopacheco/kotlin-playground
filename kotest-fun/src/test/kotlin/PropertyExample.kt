import io.kotest.core.spec.style.StringSpec
import io.kotest.property.forAll

class PropertyExample: StringSpec({
    "String size" {
        forAll<String, String> { a, b ->
            (a + b).length == a.length + b.length
        }
    }
})