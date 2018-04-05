package interfaces

/**
 * This is just like Java 8 interfaces
 * where we can define function template
 * along with some default function and value*/
interface First {
    fun doSomeFirstThing(str: String, time: Int)
    var firstTime: Int
    //we can only declare the variable but not initialize it
    //var secondTime:Int = 20
    fun getFirstTimeAgain(): Int {
        return firstTime * 10
    }
}

/**
 * Difference between interface and abstract class with abstract method
 * interface can't have state but abstract class does have state i.e.
 * we can intialize the values and stuff*/

interface doSomething {
    fun doing(first: First)
}

fun main(args: Array<String>) {
    //this is how we declare the interfaces
    var first: First = object : First {
        override var firstTime: Int
            get() = 10
            set(value) {}

        override fun doSomeFirstThing(str: String, time: Int) {
            println("I am doing something")
        }
    }
    var firstAgain = FirstClass()
    doingSth(first)
    doingSth(firstAgain)
}

fun doingSth(doSth: First) {

}

//we declare a class implementing the interface
class FirstClass() : First {
    override var firstTime: Int
        get() = 20
        set(value) {}

    override fun doSomeFirstThing(str: String, time: Int) {
        println("This is something to be done")
    }
}

//some other cool stuff
interface A {
    fun doCount() {
        println("This is counting from A")
    }
}

interface B {
    fun doCount() {
        println("This is counting from B")
    }
}

class AB : A, B {
    override fun doCount() {
        super<A>.doCount()
        //we need to be explicit  in telling which of the interface to be called
    }

}