package classes

enum class Library {
    Good, Bad, Ugly
}

enum class Priority(var position: Int) {
    Normal(10),
    Fast(20),
    Low(-20),
    Slow(10){
        override fun toString(): String {
            return "THIS IS SLOW"
        }
    }
}

//here we can created 
enum class OtherEnum(var type:String){
    Good("Very good"){
        override fun getItsType(): String {
            return "HELLO"
        }
    };

    abstract fun getItsType():String
}

fun main(args: Array<String>) {
    var library = Library.Bad
    println(library)
    //this prints the position of the enum
    println(library.ordinal)
    var priority = Priority.Normal
    //so enum has oridnal -> index
    println(priority.position)
    println(priority.name)

    println(Priority.Slow.name)
    //if we simply print the enum, the toString() would be printed
    println(Priority.Slow)
}