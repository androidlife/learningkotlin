package classes

class MoreClass(var className:String){
    init {
        println(className)
    }
    fun doSomethingWithMore(){
        println("There is nothing to do")
    }
}

fun main(args: Array<String>) {
    var moreClass = MoreClass("This is more")
    moreClass.doSomethingWithMore()
}