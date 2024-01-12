import javax.script.*

fun main(args:Array<String>) {
    println("Hello world Kotlin!")

    val engine = ScriptEngineManager().getEngineByExtension("kts")!!
    val bindings = SimpleBindings()
    bindings.put("extra",5);
    engine.setBindings(bindings, ScriptContext.GLOBAL_SCOPE)

    println (engine.eval("2 + 3 + extra"))
}