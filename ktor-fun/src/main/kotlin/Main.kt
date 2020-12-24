import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.netty.channel.epoll.Epoll
import java.util.logging.Level
import java.util.logging.Logger

fun main() {

  Logger.getLogger("io.netty").setLevel(Level.INFO);
  println("*** Netty EPOLL Available? ${Epoll.isAvailable()}")

  embeddedServer(Netty, port = 8080) {
    routing {
      get("/"){
          call.respondText("Hello, world!")
      }
    }
  }.start(wait = true)
}