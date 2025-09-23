actual class Platform actual constructor() {
    actual val name: String = "WebAssembly"
}

fun main() {
    val engine = CalculatorEngine()
    val result = engine.evaluate("9*3+1")
    println("WASM Calculator: $result")
}