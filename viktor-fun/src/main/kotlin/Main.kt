import org.jetbrains.bio.viktor.F64Array
import org.jetbrains.bio.viktor._I

fun main(args:Array<String>) {
  val m = F64Array(4, 3)
  m.V[0] = F64Array.full(3, 42.0)  // row-view.
  m.V[_I, 0]                       // column-view.
  m.V[0] = 42.0                    // broadcasting.
  m + 0.5 + m                      // arithmetic operations.
  m.V[0].exp() + 1.0               // math functions.
  println(m)
}
