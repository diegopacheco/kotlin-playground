package lambdas

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

fun main() {
    val items = listOf(1, 2, 3, 4, 5)

    // Lambdas are code blocks enclosed in curly braces.
    items.fold(0, {
        // When a lambda has parameters, they go first, followed by '->'
        acc: Int, i: Int ->
        print("acc = $acc, i = $i, ")
        val result = acc + i
        println("result = $result")
        // The last expression in a lambda is considered the return value:
        result
    })

    // Parameter types in a lambda are optional if they can be inferred:
    val joinedToString = items.fold("Elements:", { acc, i -> acc + " " + i })

    // Function references can also be used for higher-order function calls:
    val product = items.fold(1, Int::times)
    println(product)

    println("${listOf(1, 2, 3, 4, 5).fold(1, Int::times)}")

    println(sum(1,1))

    val ints = arrayListOf(1,2,3,4,5,6)
    var sum = 0
    ints.filter { it > 0 }.forEach {
        sum += it
    }
    print(sum)

    class HTML {
        fun body(){}
    }

    fun html(init: HTML.() -> Unit): HTML {
        val html = HTML()  // create the receiver object
        html.init()        // pass the receiver object to the lambda
        return html
    }

    html {       // lambda with receiver begins here
        body()   // calling a method on the receiver object
    }
}