package tricks

fun isStringEmpty(stringVal: String) {
    require(stringVal.length > 2) {
        println("The string length must be greater than 2")
    }
}