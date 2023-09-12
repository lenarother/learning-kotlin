package learning

data class Order (private val id: Int, val title: String, private val uuid: String = "foooo-bar"){
    var price: Float
        set(value) { this.price=value }
        get() { return this.price }

    val shortTitle: String
        get() = this.title[0].toString()

    fun createOrder(){
        this.title
        println(this.uuid)
    }


}