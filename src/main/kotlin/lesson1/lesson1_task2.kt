package lesson1

fun main() {
    var numberOfOrders : Int = 75 //по логике должна изменяться
    val thankfulText: String = "Thanks for your order!"
    println("Number of orders: $numberOfOrders")
    println("Order text: $thankfulText")
    var numberOfWorkers: Int = 2000
//    println("Number of workers: $numberOfWorkers")
    numberOfWorkers--
    println("Number of workers: $numberOfWorkers")
}