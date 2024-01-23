import java.nio.file.Files
import java.nio.file.Paths

fun main(){
  val stream = Files.newInputStream(Paths.get("src/main/resources/file.txt"))

  //
  // use receives a block T which extends from Closable
  //
  stream.buffered().reader().use { reader ->
    println(reader.readText())
  }
}
