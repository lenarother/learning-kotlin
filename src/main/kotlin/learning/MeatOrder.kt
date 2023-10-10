package learning1 // ktlint-disable filename

data class DrinkOrder(override val id: Int, val fruitTitle: String, override val uuid: String = "foooo-bar") :
    Order(id, fruitTitle, uuid)
