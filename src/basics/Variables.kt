package basics

fun main(args: Array<String>) {
    var firstInt:Int  = 10
    //var means variable or mutable value
    //i.e. value can be changed
    var secondInt = 10
    secondInt = 50
    var firstLong = secondInt
    var secondLong:Long = secondInt.toLong()
    //val means immutable like public static final
    // i.e. value of it can't be changed
    val thirdInt = 30
    //thirdInt = 40

    val someLong = 10L
    println(someLong)
    var someFloat = 10
    //or in better way
    var someOtherFloat = 10F

    val multiplines ="""
        This is hello
        This is hello1
        This is hello2
        """
    println(multiplines)
    //String interpolation
    val someString = "Hello"

    val infoString = "The length of someString = ${someString.length}"
    println(infoString)

    var name = "Mary"
    val nameString = "The name of your client is $name"
    println(nameString)

}