package interop1

class SomeKt(var id: Int) {
    //in order to make a field access to Java
    // we use annotation and then only we can
    // access it from Java, else we can't
    @JvmField
    var name: String = "Hello"
    @JvmOverloads
    fun setKtType(ktType: KtType = KtType.Sweet) {

    }
}

enum class KtType {
    Sweet,
    Kind
}

fun main(args: Array<String>) {
    var ktType: KtType = KtType.Sweet
    println(ktType.name)
    var ktType1: KtType = KtType.valueOf(ktType.name)
    println(ktType1.name)
}