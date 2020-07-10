package conditionals

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOfV2(a: Int, b: Int) = if (a > b) a else b

fun describe(obj: Any): String =
        when (obj) {
            1          -> "One"
            "Hello"    -> "Greeting"
            is Long    -> "Long"
            !is String -> "Not a string"
            else       -> "Unknown"
        }

fun whenExpressions():Unit{
    println("When Expressions == Describe ${describe(1)}")
}

fun main():Unit{
    println("Conditional maxOf ${maxOf(1,3)}")
    println("Conditional maxOfV2 ${maxOfV2(1,3)}")
    whenExpressions()
}