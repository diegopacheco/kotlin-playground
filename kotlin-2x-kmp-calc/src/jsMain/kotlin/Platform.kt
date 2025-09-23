actual class Platform actual constructor() {
    actual val name: String = "JavaScript"
}

fun main() {
    val engine = CalculatorEngine()
    val result = engine.evaluate("5+7/2")
    console.log("JS Calculator: $result")
}