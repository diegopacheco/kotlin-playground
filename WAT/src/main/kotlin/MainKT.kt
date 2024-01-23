data class Sbrubles(var wat: String?)

/*
operator fun Sbrubles?.plus(other:Sbrubles?): Sbrubles{
    var s1 = this
    var s2 = other
    var result = Sbrubles(s1?.wat ?: ("Blank" + s2?.wat))
    return result
}
*/

fun main(args:Array<String>){
    var result = null + null;
    println(result) // nullnull

    // Default is String
    // Uncomment line 3..10 and default will be Sbrubles
    // result will be: Sbrubles(wat=Blanknull)
}