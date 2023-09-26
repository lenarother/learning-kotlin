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
        ordersList.add(order)
        println(order.createOrder())
        println(order.price)
        println(order.shortTitle)
    }

    // println(Order(id=1, title="Title 1") == Order(id=1, title="Title 1"))
    // println(Order(id=1, title="Title 1") == Order(id=2, title="Title 2"))
    println(ordersList)
    println(ordersList.size)
}
