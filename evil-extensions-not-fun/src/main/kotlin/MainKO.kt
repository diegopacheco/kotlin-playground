class Person {
    var firstName = "Avro"
    var lastName = "DumbDoor"
}
  
//
//
// Maybe the author of the Person class forgot to include this?
//
// Kids: Do not do this at home! 
//
fun Person.print() {
   println("${this.firstName} - ${this.lastName}")
}

fun main(args: Array<String>) {
    val wizzard = Person()
    wizzard.print()
}