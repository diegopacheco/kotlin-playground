import com.github.diegopacheco.kotlingplayground.kotlinv2.*

fun main(){
  println("hello World Kotlin 2.0.0")

  println("** Local var")
  petAnimal(Cat())

  println("** Type Check With Local Operator")
  signalCheck(SuperPostponed())

  println("** Inline Functions")
  runProcessor()

  println("** Properties with function types")
  Holder( { println("Hello World") } )

  println("** Exceptions")
  testString()

  println("** Increment and Decrement Operators")
  runCode(SimpleRho())
}

