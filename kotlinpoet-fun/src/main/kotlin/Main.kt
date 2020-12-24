import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.TypeSpec

fun main(args: Array<String>) {
  val helloWorld = TypeSpec.classBuilder("HelloWorld")
          .addFunction(whatsMyNameYo("slimShady"))
          .addFunction(whatsMyNameYo("eminem"))
          .addFunction(whatsMyNameYo("marshallMathers"))
          .build()

  val kotlinFile = FileSpec.builder("com.example.helloworld", "HelloWorld")
          .addType(helloWorld)
          .build()

  kotlinFile.writeTo(System.out)
}

private fun whatsMyNameYo(name: String):FunSpec{
  return FunSpec.builder(name)
          .returns(String::class)
          .addStatement("return %S", name)
          .build()
}