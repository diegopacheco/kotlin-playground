// SAM interface - Single Abstract Method
fun interface Action{
  fun doWork()
}

fun go(action:Action) = action.doWork()

fun main(args:Array<String>) {

  // SAM conversion - passing lambda instead of SAM interface
  go{
    val x = 10
    val y = 20
    val result = x + y
    println("${x} + ${y} == ${result}")
  }

}
