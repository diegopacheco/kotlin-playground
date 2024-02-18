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
  str = null
  // Unresolved reference: lowerCasekotlin(UNRESOLVED_REFERENCE)
  //val lowerCase = str!!.lowerCase() 
}