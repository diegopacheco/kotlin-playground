class Person(
    var name:String = "",
    var email:String = "",
    var dob:String = "",
    var style:String = "",
    var github:String = "",
){
    override fun toString() = "$name $email $dob $style $github"
}

fun main(args: Array<String>) {
    val bob = Person().apply {
        name = "Bob"
        email = "bob@bob.bob"
        dob = "1990-01-01"
        style = "funny"
        github = "na"
    }
    println(bob)
}