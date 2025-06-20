val numbers = (1..10).toList()

fun main(){
  val (evens, odds) = numbers.partition { it % 2 == 0 }
  println("Evens: $evens")
  println("Odds: $odds")
}
