
fun foreach(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun foreachIndexes(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items.indices) {
        println(item)
    }
}

fun whileFun(){
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun whileExpressions(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

fun ranges(){
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

fun forRange(){
    for (x in 1..5) {
        print(x)
    }
}

fun forSteps(){
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}

fun main(){
    foreach()
    foreachIndexes()
    whileFun()
    println(whileExpressions(1))
    ranges()
    forRange()
    forSteps()
}