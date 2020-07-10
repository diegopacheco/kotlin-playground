import kotlinx.serialization.*
import kotlinx.serialization.json.Json

@Serializable
data class SimpleData(val foo: String, val bar: Int)

@OptIn(kotlinx.serialization.UnstableDefault::class)
fun main(args:Array<String>):Unit{
    val serializer = SimpleData.serializer()
    val data = SimpleData("foo", 42)
    val json = Json.stringify(serializer, data)
    println(json)
    val restoredData = Json.parse(serializer, json)
    println(restoredData)
}
