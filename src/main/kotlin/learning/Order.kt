package learning

sealed class Order(open val id: Int, val title: String, open val uuid: String = "foooo-bar") {

    var price: Float? = 23f

    val shortTitle: String
        get() = when (this) {
            is FruitOrder -> "Apple"
            is VeganOrder -> "Salad"
            is MeatOrder -> "Bacon"
        }

    fun createOrder() {
        this.title
        println(this.uuid)
    }
}

data class VeganOrder(override val id: Int, val fruitTitle: String, override val uuid: String = "foooo-bar") :
    Order(id, fruitTitle, uuid)

data class FruitOrder(override val id: Int, val fruitTitle: String, override val uuid: String = "foooo-bar") :
    Order(id, fruitTitle, uuid)

data class MeatOrder(override val id: Int, val fruitTitle: String, override val uuid: String = "foooo-bar") :
    Order(id, fruitTitle, uuid)
