import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;

//
//  Type T like in Java, erased at runtime and thus only available at compile time. 
//  So you need spesific the type on the function
//  we can get rid of that and kotlin will loook to the caller to figure out the type
//  you need inline function with reified
// 
inline fun <reified T: Any> String.toKotlinObject(): T {
  val mapper = ObjectMapper();  
  mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
  return mapper.readValue(this, T::class.java)
}

fun main(){
  val writter = ObjectMapper().writer().withDefaultPrettyPrinter()  
  val json = writter.writeValueAsString("Hello KT")
  println(json)

  val result:String = json.toKotlinObject()
  println(result)
}
