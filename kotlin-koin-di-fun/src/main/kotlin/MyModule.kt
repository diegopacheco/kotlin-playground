import org.koin.dsl.module

class MyModule {

    // declare a module
    val module = module {

        single{ "Hi Koin DI!" }

        // Define a singleton for type  DataRepository
        single { DataRepository() }

        // Define a factory (create a new instance each time) for type Presenter (infered parameter in <>)
        // Resolve constructor dependency with get()
        factory<Presenter> { MyPresenter(get()) }
    }

}