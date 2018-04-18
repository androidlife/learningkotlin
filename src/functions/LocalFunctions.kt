package functions

//this is like a local function inside a function
// meaning a function inside a function
// this local function is accessible by the function only
// not any other

fun outer(outerValue: String) {
    val someOtherOuterValue = "Some Other Value Outer"
    fun inner(innerValue: String) {
        //this is the inner function or the local function
        //which has access to it's inner values along with it's outer values as well
        println("INNER: ".plus(innerValue))
        println("OUTER: ".plus(outerValue))
        println("OUTER OTHER: ".plus(someOtherOuterValue))
    }
    //so this is accessible from this function only
    inner("PASSING INNER")
}

fun main(args: Array<String>) {
    outer("THIS IS OUTER")

}