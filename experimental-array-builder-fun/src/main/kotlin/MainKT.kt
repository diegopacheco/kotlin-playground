@OptIn(ExperimentalStdlibApi::class)
fun experimentalArrayBuilder() = buildList {
  add("fast")
  add("safe")
}

fun main(){
  val list = experimentalArrayBuilder()
  println(list) // Output: [fast, safe]
}
