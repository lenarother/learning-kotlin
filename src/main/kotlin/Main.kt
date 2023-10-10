import learning.Order

fun main(args: Array<String>) {
    println("Hello World!")
    // style linters: Detekt, Ktlint, Kotlinter

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val ordersList = mutableListOf<Order>()

    for (i in 1..10) {
        var order = Order(id = i, title = "Title $i")
        order.price = null
        ordersList.add(order)
        // println(order.createOrder())
        var price = order.price?.let {
            it+2
        } ?: 0f
        //println(order.price)
        //println(order.shortTitle)
    }

//    comperhansion
//    orders = [Order1(), Order2(), Order3()]
//    ids = [order.id for order in orders]

    val ids = ordersList.associate { order -> order.id to order.title }
    println(ids)
    // {order.id:  order.title for  order in orders}

    val numbers = listOf("one", "two", "three", "four")

//    println(numbers.associateWith { it.length })

    //println(ids)

    // println(Order(id=1, title="Title 1") == Order(id=1, title="Title 1"))
    // println(Order(id=1, title="Title 1") == Order(id=2, title="Title 2"))
    println(ordersList)
    println(ordersList.size)
}
