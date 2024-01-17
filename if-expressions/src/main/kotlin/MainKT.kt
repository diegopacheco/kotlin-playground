fun main(args:Array<String>) {

    val max:Int  = if (42 > 12) 42 else 12
    println("Max is ${max}")

    val x = 20
    val min = when (x) {
        19 -> print("x == 20 \n")
        30 -> print("x == 30 \n")
        else -> {
            print("x is <= 20 \n")
            x -5
        }
    }
    println("Min is ${min}")



}