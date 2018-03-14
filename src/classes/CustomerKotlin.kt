package classes

class SomeTest() {

}

data class Customer1(var id: Int, var name: String) {
    override fun equals(other: Any?): Boolean {
        if (other is Customer1) {
            return other.id == id
        }
        return super.equals(other)
    }
}

fun main(args: Array<String>) {
    var customer = Customer1(10, "Santosh");
    var customer2 = Customer1(10, "Santosh1")
    println(customer == customer2)
    var customer3 = customer2.copy()
    println(customer3.id)
}