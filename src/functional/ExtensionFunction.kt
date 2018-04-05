package functional

//for String class
// we are creating a new function without extending the class
// but what I need to check is that, I believe a new class
//extensing string will be made and a new method will be added
//so it can access any method and variables ( public ones )
// of that class
fun String.hello() {
    println("Say HELLO")
}

fun main(args: Array<String>) {
    val someStr: String = "New String"
    someStr.hello()

    val coolStuff:CoolStuff = CoolStuff();
    coolStuff.isCold()
}

class CoolStuff {
    fun doingCoolStuff() {
        println("I am doing cool stuff")
    }
}

fun CoolStuff.isCold(): Boolean {
    return true
}