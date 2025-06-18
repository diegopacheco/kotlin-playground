val sortingStrategy = object : Comparator<Int> {
  override fun compare(o1: Int, o2: Int): Int = o2 - o1
}
val sortedDescending = listOf(1, 2, 3).sortedWith(sortingStrategy)

fun main(){
  val numbers = listOf(1, 2, 3, 4, 5)
  val sortedNumbers = numbers.sortedWith(sortingStrategy)
  println(sortedNumbers) // Output: [5, 4, 3, 2, 1]
  println(sortedDescending) // Output: [3, 2, 1]
}
