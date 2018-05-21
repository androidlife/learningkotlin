package classes

class ShoppingMall(val title: String, val location: String = "NotGiven", val phone: Int = 9800)

fun main(args: Array<String>) {
    val shoppingMall = ShoppingMall(title = "Hello", phone = 111)

}