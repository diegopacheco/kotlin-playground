fun interface Formatter {
  fun format(value: String): String
}
val upperCaseFormatter = Formatter { it.uppercase() }

fun main(){
  val input = "hello world"
  val formatted = upperCaseFormatter.format(input)
  println(formatted) // Output: HELLO WORLD
}
