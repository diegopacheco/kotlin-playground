fun fibonacci(): Sequence<Int> = sequence {
  var a = 0; var b = 1
  yield(a)
  yield(b)
  while (true) {
    val next = a + b
    yield(next)
    a = b; b = next
  }
}

fun main(){
  val fib = fibonacci()
  println("First 10 Fibonacci numbers:")
  fib.take(10).forEach { println(it) }
  
  println("\nFibonacci numbers greater than 100:")
  fib.filter { it > 100 }.take(10).forEach { println(it) }

  println("\nFibonacci numbers less than 1000:")
  fib.takeWhile { it < 1000 }.forEach { println(it) }
}
