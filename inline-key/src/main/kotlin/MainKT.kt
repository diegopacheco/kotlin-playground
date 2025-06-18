@JvmInline
value class ConfigKey(val key: String)

fun main(){
  val configMap = mapOf(ConfigKey("env") to "non-prod",
                        ConfigKey("version") to "1.0.0",
                        ConfigKey("debug") to "false")
  println("Config Map: $configMap")
}
