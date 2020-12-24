import org.koin.core.context.startKoin

fun main(args:Array<String>) {

  val koin = startKoin {
    // enable Printlogger with default Level.INFO
    // can have Level & implementation
    // equivalent to logger(Level.INFO, PrintLogger())
    printLogger()

    // declare properties from given map
    properties(mapOf("app.kotlin.version" to "1.4",
            "app.java.version" to "1.8")
    )

    // load properties from koin.properties file or given file name
    fileProperties()

    // load properties from environment
    environmentProperties()

    // list all used modules
    // as list or vararg
    modules(MyModule().module)
  }.koin

  val bean: Presenter = koin.get<Presenter>()
  println("Presenter Message: ${bean.message}")

  // Dynamic declare bean on Koin on the fly
  class Answer(val always:Int=42)
  val answer = Answer()
  koin.declare(answer)

  val a = koin.get<Answer>()
  println("The question of the universe life and whatever must have the answer == ${a.always}")

}