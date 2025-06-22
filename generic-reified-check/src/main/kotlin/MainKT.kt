inline fun <reified T> isInstance(value: Any): Boolean =
  value is T

fun main(){
  println(isInstance<String>("100"))   // true
  println(isInstance<String>("test"))  // true
  println(isInstance<Boolean>("test")) // false
  println(isInstance<Boolean>(true))   // true
}
