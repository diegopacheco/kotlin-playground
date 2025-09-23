actual class Platform actual constructor() {
    actual val name: String = "iOS"
}

fun iosMain() {
    val engine = CalculatorEngine()
    val result = engine.evaluate("10-2*3")
    println("iOS Calculator: $result")
}