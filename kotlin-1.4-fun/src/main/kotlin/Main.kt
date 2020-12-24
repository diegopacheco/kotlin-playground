
fun main(args:Array<String>) {

  // ListOf
  val numbers = listOf(1, 2, 3,6)
  val map = mapOf(1 to "One",
          2 to "Two",
          3 to "Three",
          6 to "Six")
  println("ListOf: ${map}")

  // Filter
  val filtered = numbers.filter { it > 5 }
  println("Filter: ${filtered}")

  // GroupBy
  val groups = numbers.groupBy {
    if (it % 2 == 0) "even" else "odd"
  }
  println("Group by ${groups}")

  // PartitionBy
  val (evens, odds) = numbers.partition { it % 2 == 0 }
  println("evens ${evens} odds {$odds}")

  // SortBy
  val users = arrayListOf<Int>(1,6,5,2,3,4,8)
  users.sortBy { it }
  println("Sorted users uds ${users}")

  //Zip
  val pairs = listOf(1, 2, 3).zip(listOf("one", "two", "three")) // List>
  println("Zip ${pairs}")

  // Inflix Function
  val list = mutableListOf("a", "b", "c")
  list += "d"
  list -= "d"
  println("Inflix functions ${list}")

  // Collect and Them
  val topPaidEmployee = listOf("Alex" to 250, "Boss" to 999, "Chris" to 400)
          .filter { it.first != "Boss" }
          .maxBy { it.second }
          ?.first
          ?: throw IllegalStateException("No employees")
  println("Collect and them ${topPaidEmployee}")
}
