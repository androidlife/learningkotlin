package tidbits

class NotANumberException(msg: String) : Throwable(msg) {

}

fun isANumber(obj: Any): Boolean {
    when (obj) {
        !is Int, Long -> throw NotANumberException("Not a number exception")
    }
    return true
}

fun main(args: Array<String>) {
    try {
        isANumber("Hello")
    } catch (e: NotANumberException) {
        println("${e.message}")
    }

}