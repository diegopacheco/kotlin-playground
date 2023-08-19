
fun sum(a:Int,b:Int): Int {
    return a + b
}

fun sub(a:Int,b:Int): Int = a - b

fun mul(a:Int,b:Int) = a * b

fun div(a:Int,b:Int): Int {
    return a / b
}

fun main() {
    println("sum 1 + 2 = ${sum(1,2)}")
    println("sub 10 - 2 = ${sub(10,2)}")
    println("mul 3 * 5 = ${mul(3,5)}")
    println("div 20 / 5 = ${div(20,5)}")
}
