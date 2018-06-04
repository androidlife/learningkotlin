package lambda

import java.lang.StringBuilder

fun doSomeAdditionOne(fn: (Int) -> Unit) {
    fn(10)
}

fun doSomeStringAddition(fn: (StringBuilder) -> Unit): String {
    val stringBuilder = StringBuilder()
    fn(stringBuilder)
    return stringBuilder.toString()
}

fun doSomeStringAddition1(fn: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    fn(stringBuilder)
    return stringBuilder.toString()
}

fun main(args: Array<String>) {
    doSomeAdditionOne { it * it }
    //Int = in comes as parameter
    //String = out is a return type
    val someFun = object : Function1<Int, String> {
        override fun invoke(p1: Int): String {
            return p1.toString()
        }
    }
    someFun.invoke(20)
    val otherFun = fun(input: Int): String {
        return input.toString()
    }
    otherFun(20)

    doSomeAdditionOne { println(it) }


    doSomeStringAddition {
        it.append("A")
        it.append("B")
        it.append("C")
    }

    doSomeStringAddition1 {
        append("A")
        append("B")
        append("C")
    }
}