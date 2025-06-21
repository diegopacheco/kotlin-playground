tailrec fun factorial(n: Long, acc: Long = 1): Long =
  if (n <= 1) acc else factorial(n - 1, acc * n)

fun main(){
  val number = 5L
  println("Factorial of $number is ${factorial(number)}")
}
