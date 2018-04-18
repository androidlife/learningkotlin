package functions

//this works for extensions functions
// mainly concerned with expressive ness only
//fun String.shouldEqualTo(someVal:String) = someVal.equals(this)
//the above can be written in following manner
infix fun String.shouldEqualTo(someVal: String) = someVal.equals(this)

infix fun CheckForInfix.addAnotherType(otherType: Int) = {
    val newOne = type + otherType
    println(newOne)
}

fun main(args: Array<String>) {
    //normal extension function
    "Hello".shouldEqualTo("OtherValue")
    //in fix extension function, became more expressiv
    "Hello" shouldEqualTo "OtherHello"
    val other = "SomeOther"
    // seems like just for expressiveness, other use can't be identified
    other shouldEqualTo "SomeOther"
    //
    CheckForInfix(30).addAnotherType(20)
}

class CheckForInfix(val type: Int) {
    fun printType() {
        println(type)
    }
}