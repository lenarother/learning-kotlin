package learning

data class Order (val id: Int, val title: String, private val uuid: String = "foooo-bar"){
    var price: Float = 23f

    val shortTitle: String
        get() = this.title[0].toString()

    fun createOrder(){
        this.title
        println(this.uuid)
    }


}