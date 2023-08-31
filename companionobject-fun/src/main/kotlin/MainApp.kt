interface Greater{
    fun great(name:String):String
}

interface GreaterFactory{
    fun hello():Greater
}


class EnglishGreater(
    private val message:String = "Greetings"
) : Greater{
    override fun great(name:String):String = "$message $name"

    companion object : GreaterFactory {
        override fun hello() = EnglishGreater("Hi,")
    }
}

fun main() {
    println(EnglishGreater.hello().great("John Doe"))
}