package idioms

import java.math.BigDecimal

/**
 * Getters, Setters, hasCode, toString, copy, Equals
 */
data class Person(val name: String, val email: String)

fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")

object MySingleton {
    val name = "Name"
}

fun main() {
    // would throw: kotlin.NotImplementedError: An operation is not implemented: Waiting for feedback from accounting
    // calcTaxes()

    val p = Person("Diego","diego.pacheco.it@gmail.com")
    println(p)
    println(p.email)
    println(p.equals(p))

    val list = listOf(-1,2,-3,4,5,-1,0,-8,-10)
    val positives = list.filter { x -> x > 0 }
    println("Filter positives ${positives}")

    val positivesV2 = list.filter { it > 0 }
    println("Filter positivesV2 ${positivesV2}")

    if (2 in list) {
        println("2 is here")
    }
    if (-11 !in list) {
        println("-11 not here")
    }

    val map = mapOf("RS" to "POA","SC" to "Floripa")
    for ((k, v) in map) {
        println("$k -> $v")
    }
    println(map["RS"])

    val l:String by lazy {
        println("this is lazy prop - runnign now... ")
        "Lazy P"
    }
    println("something else...")
    println("$l")

    fun String.to42():String = "Forget original string: 42"
    println("Convert this to camelcase".to42())

    println(MySingleton)
    println(MySingleton)
}
