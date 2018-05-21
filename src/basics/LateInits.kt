package basics

class LateInitTest {
    lateinit var someName: String

    fun printSomeName() {
        println("This is lateinit var $someName")
    }
}

fun main(args: Array<String>) {
    LateInitTest().printSomeName()
}