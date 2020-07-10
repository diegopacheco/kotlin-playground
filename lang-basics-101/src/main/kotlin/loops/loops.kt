package loops

fun basicLoop(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        print("$item, ")
    }
    print("\n");
}

fun loopsV2(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}

fun whileLoop(){
    val items = listOf("while.apple", "while.banana", "while.kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun loopRange(){
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }
}

fun loopRangeV2(){
    for (x in 1..5) {
        print(x)
    }
    for (x in 6..10 step 2) {
        print(x)
    }
}

fun main():Unit {
    basicLoop()
    loopsV2()
    whileLoop()
    loopRange()
    loopRangeV2()
}