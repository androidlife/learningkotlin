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

fun SomeFunWithExtension.otherExtension(otherInt: Int) {
    println("OtherExtension() $otherInt")
}

fun main(args: Array<String>) {
    val someFunWithExtension = SomeFunWithExtension()
    someFunWithExtension.firstExtension("This is another name")
    someFunWithExtension.otherExtension(20)
}



