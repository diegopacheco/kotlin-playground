import java.util.*
import java.util.stream.Collectors

fun main(args:Array<String>) {

  val names = Arrays.asList("Diego", "Andressa", "Gandalf", "Melina")
  val nameMap = names
          .map { obj: String -> obj.toLowerCase() }
          .associateBy { it }
  println(nameMap)

  val listWithDuplicates = Arrays.asList("Gremio", "Gremio", "Gremio", "Barcelona", "Gremio")
  val result = listWithDuplicates.stream().filter { e: String -> !e.startsWith("B") }.collect(Collectors.toSet())
  println("Removed Duplicates: $result")

  val cities = Arrays.asList("Porto", "Cabo", "Rio", "Planalto", "Cachorro")
  val joined = cities.stream().collect(Collectors.joining(" velho, "))
  println("Joined: $joined")

  val numbers = Arrays.asList(1, 10, 42, 34, 27, 32, 3, 18)
  val stats = numbers.stream().collect(Collectors.summarizingInt { i: Int? -> Integer.valueOf(i!!) })
  println("Max   : " + stats.max)
  println("Min   : " + stats.min)
  println("Avg   : " + stats.average)
  println("Count : " + stats.count)
  println("Sum   : " + stats.sum)
}
