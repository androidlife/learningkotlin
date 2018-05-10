package functions

//what is operator like + - and so on
// how can we overload that

data class Time(val time: Int) {
    //if we simply add a type called
    //operator
    operator fun minus(a: Int) {
        val newTime = time - a
        println(newTime)
    }

    operator fun plus(time: Time): Time {
        val newTime = time.time + this.time
        return Time(newTime)
    }

    //remember you can't add your own function name
    //this is operator overlaoding, the same concept
    // that of function overloading, so you must
    // need to have same function name
    operator fun times(a: Int) {

    }
}

fun main(args: Array<String>) {
    //this will call minus()function as we did operator overloading
    val time = Time(10) - 5
    //this will call plus() function as we did operator overloading for plus
    val otherTime = Time(10) + Time(30)
}