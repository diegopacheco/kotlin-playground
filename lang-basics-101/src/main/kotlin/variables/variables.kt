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

    val creditCardNumber = 1234_5678_9012_3456L
    println(creditCardNumber)

    val text = """
    for (c in "foo")
        print(c)
    """
    println(text)

    val textV2 = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """.trimMargin()
    println(textV2)

    val price = """
    ${'$'}9.99
    """
    println(price)


}