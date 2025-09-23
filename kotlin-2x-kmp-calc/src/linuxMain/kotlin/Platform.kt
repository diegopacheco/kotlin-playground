actual class Platform actual constructor() {
    actual val name: String = "Linux"
}

fun main() {
    val engine = CalculatorEngine()
    val result = engine.evaluate("15-3*2")
    println("Linux Calculator: $result")
}