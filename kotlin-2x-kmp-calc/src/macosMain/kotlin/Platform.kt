actual class Platform actual constructor() {
    actual val name: String = "macOS"
}

fun main() {
    val engine = CalculatorEngine()
    val result = engine.evaluate("12+8/4")
    println("macOS Calculator: $result")
}