package nullables

fun parseInt(str: String?): Int? {
    if (null==str) return 0;
    return Integer.parseInt(str);
}

fun printProduct(arg1: String, arg2: String?) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    // Using `x * y` yields error because they may hold nulls.
    if (x != null && y != null) {
        // x and y are automatically cast to non-nullable after null check
        println(x * y)
    }else {
        println("'$arg1' or '$arg2' is not a number")
    }
}

// by default parameters are non-nullable
// you need to pass ? to allow null
fun main():Unit{
    printProduct("1","1")
    printProduct("1",null)
    // dont compile
    //printProduct(null,"1")
}