package functions

inline fun doSomeInlining(fn: () -> Unit) {
    println("Before invoking passed function")
    fn()
    println("After invoking the passed function")
}

fun main(args: Array<String>) {
    doSomeInlining { "This is called from main" }
}

fun otherCallToInline() {
    doSomeInlining { "This is called from other function" }
}