package collections

fun main():Unit {
   val items = listOf<String>("A","B","C")
    for (item in items) {
        println(item)
    }

    when {
        "A" in items -> println("A is here")
        "D" in items -> println("D is here")
    }

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}