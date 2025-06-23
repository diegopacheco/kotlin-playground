class RegexBuilder {
  private val pattern = StringBuilder()
  fun literal(text: String) { pattern.append(Regex.escape(text)) }
  fun digit() { pattern.append("\\d") }
  override fun toString() = pattern.toString()
}
fun regex(block: RegexBuilder.() -> Unit): Regex = Regex(RegexBuilder().apply(block).toString())

fun main(){
  val r = regex {
    literal("abc")
    digit()
  }
  println(r.pattern) // prints "abc\\d"
  println(r.matches("abc1")) // prints "true"
  println(r.matches("abc2")) // prints "true"
  println(r.matches("abc")) // prints "false"
  println(r.matches("ab1c")) // prints "false"
}
