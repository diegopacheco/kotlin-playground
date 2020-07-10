package functions

fun sumV1(a: Int, b: Int): Int {
    return a + b
}

fun sumV2(a: Int, b: Int) = a + b

fun printSumV3(a: Int, b: Int): Unit {
    println("sumV3 of $a and $b is ${a + b}")
}

fun fooDefaults(a: Int = 0, b: String = "") {
    println("a = ${a} b = ${b}")
}


fun main():Unit {
    println("sumV1 1 +1 = " + sumV1(1,1))
    println("sumV2 1 +1 = " + sumV2(1,1))
    printSumV3(1,1)
    fooDefaults()
}