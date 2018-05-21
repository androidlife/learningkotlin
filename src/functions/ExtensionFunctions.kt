package functions

open class SomeFunWithExtension {
    val name = "SomeFunWithExtension"

    fun printName() {
        println(name)
    }

    private fun printPrivateName() {
        println("This is private Name")
    }
}

fun SomeFunWithExtension.firstExtension(otherName: String) {
    printName()
    println("firstExtension() $otherName")

}

fun SomeFunWithExtension.secondExtension(otherInt: Int) {
    println(name)
    println("OtherExtension() $otherInt")
}

fun SomeFunWithExtension.thirdExtension(thirdName: Int): Int {
    printName()
    return thirdName
}

fun main(args: Array<String>) {
    val someFunWithExtension = SomeFunWithExtension()
    someFunWithExtension.firstExtension("This is another name")
    someFunWithExtension.secondExtension(20)
}



