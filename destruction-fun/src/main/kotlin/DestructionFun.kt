class Person(val name: String, val age: Int) {
    operator fun component1(): String {
        return name
    }
    operator fun component2(): Int {
        return age
    }
}

fun main() {
    val person = Person("Adam", 100)
    val (name, age) = person
    println("name $name age $age")

    val pair = Pair(1, 2)
    val (first, second) = pair
    println("first $first second $second")

    val coordinates = arrayOf(1, 2, 3)
    val (x, y, z) = coordinates
    println("x $x y $y z $z")
}