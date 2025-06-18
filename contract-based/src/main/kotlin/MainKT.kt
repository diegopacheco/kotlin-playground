import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract
import kotlin.contracts.InvocationKind

@OptIn(ExperimentalContracts::class)
inline fun <T> using(resource: AutoCloseable, block: (AutoCloseable) -> T): T {
  contract { callsInPlace(block, InvocationKind.EXACTLY_ONCE) }
  return resource.use(block)
}

fun main(){
    using(AutoCloseable { println("Resource closed") }) { resource ->
        println("Using resource: $resource")
        // Perform operations with the resource
    }
    // Resource is automatically closed after the block
    println("Main function completed")
}
