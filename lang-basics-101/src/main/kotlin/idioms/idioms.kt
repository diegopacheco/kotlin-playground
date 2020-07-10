package idioms

/**
 * Getters, Setters, hasCode, toString, copy, Equals
 */
data class Person(val name: String, val email: String)

fun main() {
    val p = Person("Diego","diego.pacheco.it@gmail.com")
    println(p)
    println(p.email)
    println(p.equals(p))
}
