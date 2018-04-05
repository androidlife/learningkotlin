package classes

//objects provides an easy way to create singletons

object First {
    var firstValue = "This is first"
    fun printFirstValue() {
        println("I am printing not the first value")
    }
}

fun main(args: Array<String>) {
    var first = First
    println(first.firstValue)
    println(first.printFirstValue())
    var firstAgain = First
    firstAgain.firstValue = "This is first other value"
    println(first.firstValue)
    println(firstAgain.firstValue)

    var localSingleton = object {
        var time = 10
    }

    println(localSingleton.time)
}