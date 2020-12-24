open class DataRepository
open class Presenter(open val message:String)
class MyPresenter(override val message:String) : Presenter(message){}