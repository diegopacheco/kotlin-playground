

fun main(ars:Array<String>) {

    //
    // without yield it would run forever
    //
    val fib = sequence {
        print("start the coroutine")
        yield(1)
        var cur = 1
        var next = 1
        while (true){
            print("Next")
            yield(next)
            val tmp = cur + next
            cur = next
            next = tmp
        }
    }

    fib.take(3).forEach {
        println("$it ")
    }

    //
    // will print:
    //
    //  start the coroutineNext1
    //  Next2
    //  Next3
    //

}