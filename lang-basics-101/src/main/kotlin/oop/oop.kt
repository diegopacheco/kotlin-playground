package oop

class Printer{
    fun printA():Unit = println("A")
    fun printB():Unit = println("B")
    fun printC():Unit = println("C")
}

class Cordinates{
    var x = 0
    var y = 0
    override fun toString():String = "${x}:${y}"
}

fun main() {
    val p = Printer()
    with(p){
        printA()
        printB()
        printC()
    }

    val myCordinates = Cordinates().apply {
        x = 100
        y = 300
    }
    println(myCordinates)
}