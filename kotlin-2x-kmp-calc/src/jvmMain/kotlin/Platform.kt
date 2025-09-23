actual class Platform actual constructor() {
    actual val name: String = "JVM"
}

fun main() {
    val engine = CalculatorEngine()
    val result = engine.evaluate("8/2+6")
    println("JVM Calculator: $result")
}