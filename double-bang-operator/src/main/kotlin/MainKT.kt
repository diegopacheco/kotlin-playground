import kotlin.text.toLowerCase

/**
 * https://stackoverflow.com/questions/34342413/what-is-the-kotlin-double-bang-operator
 * 
 * Kotlin's double-bang operator is an excellent sample 
 *  for fans of NullPointerException (NPE).
 * 
 */
fun main(args: Array<String>) {
  var email: String?
  email = null
  // compilation error
  //println(email!!) // The result of the expression is always nullkotlin(ALWAYS_NULL)
  
  var str :String? = "Foo"
  // uncomment str and you will have a problem
  //str = null 
  // Unresolved reference: lowerCasekotlin(UNRESOLVED_REFERENCE)
  val lowerCase = str!!.lowercase()
  println(lowerCase)

  val willWork :String? = "works"
  printMe(willWork)
}

fun printMe(str: String?): Unit {
  val lowerCase = str!!.lowercase()
  println(lowerCase)
}