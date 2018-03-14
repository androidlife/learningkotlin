package basics

import utils.doSomething as PrintSomething

fun main(args: Array<String>) {
    conditionalTest()
}

fun conditionalTest() {
    var a = 20
    var b = if (a > 10)
        println("GREATER THAN 10")
    else
        println("LESS THAN OR EQUAL TO 10")
    println(b)

    var c = if (a > 10)
        "GREATER"
    else
        "LESSER OR EQUAL"
    println(c is String)
    //similar to switch statements
    when (c) {
        "HELLO" -> println("This is HELLO")
        "GREATER1" -> println("This is GREATER")
        else -> println("NOTHING")
    }

    PrintSomething("Hello")
}