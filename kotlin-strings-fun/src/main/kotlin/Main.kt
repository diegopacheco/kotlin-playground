
fun main(args:Array<String>) {

  val myString = "super cool"
  println(myString.capitalize())

  println("position 0 == ${myString[0]}")
  println("position END == ${myString[myString.length-1]}")
  println("first: ${myString.first()}")
  println("last: ${myString.last()}")

  val aa = "aa"
  val aaa = "aa"
  if (aaa==aa && "aa"==aa){
    println("aa==aa works")
  }

  if ("".isEmpty()){
    print("cool \"\" is empty! ")
  }

  for(c in "mystring"){
    print("|${c}|")
  }
  println("")

  fun Char.isEnglishVowel(): Boolean =  this.toLowerCase() == 'a'
          || this.toLowerCase() == 'e'
          || this.toLowerCase() == 'i'
          || this.toLowerCase() == 'o'
          || this.toLowerCase() == 'u'
          || this.toLowerCase() == 'y'
  println("there is vals?".filter{ it.isEnglishVowel() })

  val word = "eagle,falcon,hawk,owl"
  val birds = word.split(",")
  birds.forEach(::println)

}
