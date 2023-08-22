fun count(): Int {
    println("one")
    return 10/10
}

fun main() {
    val result = try {
        count()
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
    println("Result from try-expression: ${result}")
}