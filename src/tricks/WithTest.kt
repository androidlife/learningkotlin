package tricks

class Witcher(var witchName:String){
    fun printName(){
        println("This name of the witch = $witchName")
    }
}

fun main(args: Array<String>) {
    val witcher = Witcher("Awesome Game")
    with(witcher){
        witcher.witchName += "PS4"
        printName()
    }
}