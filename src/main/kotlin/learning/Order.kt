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

open class Supplier(val name: String) {
    var products: List<Order> = mutableListOf(FruitOrder(1, "Apple", "apple-uuid"))
}

class FrutSupplier(name: String) : Supplier(name = name) {
    override fun toString(): String {
        return "FruitSupplier: $name $products"
    }
}

abstract class Article(open val name: String, open val supplier: Supplier) {
    fun send() = println("Sending $name")
}

class FruitArticle(override val name: String, override val supplier: Supplier) : Article(name, supplier)


