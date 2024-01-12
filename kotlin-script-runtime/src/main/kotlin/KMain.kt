import javax.script.*

//
// Thanks to the JSR-223
// https://stackoverflow.com/questions/11838369/where-can-i-find-a-list-of-available-jsr-223-scripting-languages
//
fun main(args:Array<String>) {
    println("Hello world Kotlin!")

    val engine = ScriptEngineManager().getEngineByExtension("kts")!!
    val bindings = SimpleBindings()
    bindings.put("extra",5);
    engine.setBindings(bindings, ScriptContext.GLOBAL_SCOPE)

    println (engine.eval("2 + 3 + extra"))
}