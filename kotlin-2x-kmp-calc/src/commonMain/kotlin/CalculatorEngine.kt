class CalculatorEngine {
    private val calculator = Calculator()

    fun evaluate(expression: String): Double {
        val tokens = tokenize(expression)
        return calculateFromTokens(tokens)
    }

    private fun tokenize(expression: String): List<String> {
        val tokens = mutableListOf<String>()
        var currentNumber = ""

        for (char in expression) {
            when {
                calculator.isValidDigit(char) || char == '.' -> {
                    currentNumber += char
                }
                calculator.isValidOperation(char) -> {
                    if (currentNumber.isNotEmpty()) {
                        tokens.add(currentNumber)
                        currentNumber = ""
                    }
                    tokens.add(char.toString())
                }
            }
        }

        if (currentNumber.isNotEmpty()) {
            tokens.add(currentNumber)
        }

        return tokens
    }

    private fun calculateFromTokens(tokens: List<String>): Double {
        if (tokens.isEmpty()) return 0.0
        if (tokens.size == 1) return calculator.parseNumber(tokens[0])

        var result = calculator.parseNumber(tokens[0])

        var i = 1
        while (i < tokens.size - 1) {
            val operator = tokens[i]
            val operand = calculator.parseNumber(tokens[i + 1])

            result = when (operator) {
                "+" -> calculator.add(result, operand)
                "-" -> calculator.subtract(result, operand)
                "*" -> calculator.multiply(result, operand)
                "/" -> calculator.divide(result, operand)
                else -> result
            }

            i += 2
        }

        return result
    }
}