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

/*
* Inheritance
* */
open class Base(p: Int){
    open val x = p
}
class Derived(p: Int) : Base(p) {
    override fun toString(): String = "$x"
}

interface Shape {
    val vertexCount: Int
}
class Rectangle(override val vertexCount: Int = 4) : Shape // Always has 4 vertices
class Polygon : Shape {
    override var vertexCount: Int = 0  // Can be set to any number later
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

    class Person {
        var name = ""
        var children: MutableList<Person> = mutableListOf<Person>()
        constructor(n:String, kid: Person) {
            this.name = n
            this.children.add(kid)
        }
        constructor(n:String){
            this.name = n
        }
        override fun toString():String = name + " Kids: " + children.map { "Child:" + it.name }
    }
    val personFilho = Person("Son")
    val personPai = Person("Father",personFilho)
    println(personPai)

    val inheritance = Derived(42)
    println(inheritance)

    val r = Rectangle()
    var po = Polygon()
    println("Retangle: ${r.vertexCount} Polygon: ${po.vertexCount}")
}