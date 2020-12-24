import arrow.core.*
import arrow.core.extensions.monoid
import arrow.core.extensions.semigroup

fun main(args:Array<String>) {

  // SemmiGroup
  val result =String.semigroup().run { "1".combine("2") } // 12
  println("SemmiGroup $result")

  // Monoid
  println("Monoid: " + String.monoid().run { "1".combine("2") }) // "12"
  println("Monoid: " + String.monoid().run { listOf("1", "@", "3").combineAll() }) // "1@3"
  println("Monoid: " + String.monoid().run { empty() }) // ""

  // Functor
  println("Functor = " + Either.right(1).map { it * 2 })
  println("Functor = " + Option(1).map { it * 2 })

  // Monad
  val resultMonad = Some(1).flatMap { a ->
    Some(a + 1)
  }
  print("Monad $resultMonad")

}
