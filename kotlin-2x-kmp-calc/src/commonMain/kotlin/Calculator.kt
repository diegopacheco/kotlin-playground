class Calculator {
    fun add(a: Double, b: Double): Double = a + b

    fun subtract(a: Double, b: Double): Double = a - b

    fun multiply(a: Double, b: Double): Double = a * b

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) throw IllegalArgumentException("Division by zero")
        return a / b
    }

    fun parseNumber(input: String): Double {
        val filtered = input.filter { it.isDigit() || it == '.' }
        return filtered.toDoubleOrNull() ?: 0.0
    }

    fun isValidDigit(char: Char): Boolean = char in '0'..'9'

    fun isValidOperation(char: Char): Boolean = char in "+-*/"
}