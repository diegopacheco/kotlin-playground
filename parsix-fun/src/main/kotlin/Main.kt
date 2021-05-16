import parsix.core.Ok
import parsix.core.TerminalError
import parsix.core.Parsed

data class Age(val value: UInt)
data class AdultAge(val value: UInt)
data class NotAdultError(val inp: Age) : TerminalError

fun parseAdultAge(inp:Age): Parsed<AdultAge> =
  if (inp.value >= 18u)
    Ok(AdultAge(inp.value))
  else
    NotAdultError(inp)

fun main(args:Array<String>) {
  println("Adult? 37 == " + parseAdultAge(Age(37u)))
  println("Adult? 17 == " + parseAdultAge(Age(17u)))
}
