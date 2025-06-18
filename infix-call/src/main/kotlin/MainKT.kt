infix fun String.wrap(tag: String) = "<$tag>$this</$tag>"
val xml = "hello" wrap "greeting"

fun main(){
    println(xml)  // Output: <greeting>hello</greeting>
}
