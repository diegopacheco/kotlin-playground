import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.dsl.module
import org.koin.test.KoinTest
import org.koin.test.inject
import kotlin.test.assertNotNull

class MyTest : KoinTest {

    val testModule = module {
        single{ "Hi Koin DI!" }
        factory<Presenter> { MyPresenter(get()) }
    }

    // Lazy inject property
    val component : Presenter by inject()

    @Test
    fun `make a test with Koin`() {
        startKoin { modules(testModule) }
        assertNotNull(component)
        print(component)
    }

}