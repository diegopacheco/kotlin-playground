
fun main(args:Array<String>) {
  println("TakeIf ${displaySubstringPosition("this is it","it")}")

  // With
  val numbers = mutableListOf("one", "two", "three")
  with(numbers) {
    val firstItem = first()
    val lastItem = last()
    println("First item: $firstItem, last item: $lastItem")
  }
}

fun displaySubstringPosition(input: String, sub: String):Int? {
  val result = input.indexOf(sub).takeIf { it >= 0 }?.let {
    println("** The substring [$sub] is found in [$input].")
    println("** Its start position is [$it]")
    42
  }
  return result
}