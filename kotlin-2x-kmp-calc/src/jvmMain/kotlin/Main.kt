fun main() {
    val engine = CalculatorEngine()

    println("Kotlin Multiplatform Calculator - JVM")
    println("2 + 3 = ${engine.evaluate("2+3")}")
    println("10 - 4 = ${engine.evaluate("10-4")}")
    println("5 * 6 = ${engine.evaluate("5*6")}")
    println("15 / 3 = ${engine.evaluate("15/3")}")
    println("2 + 3 * 4 = ${engine.evaluate("2+3*4")}")
}