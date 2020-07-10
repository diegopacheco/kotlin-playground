package variables

fun main():Unit {
    val a: Int = 1  // immediate assignment
    val b = 2   // `Int` type is inferred
    val c: Int  // Type required when no initializer is provided
    c = 3       // deferred assignment

    var x = 5 // `Int` type is inferred
    x += 1

    // String template
    println(" Variables :: a ${a} b ${b} c ${c}")
    println(" Variables :: x ${x}")
}