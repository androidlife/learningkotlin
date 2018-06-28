package basics

//Kotlin is statically typed language
//what is statically typed language
// a language in which types once declared can't be changed i.e. not dynamic
//like if I say  var a:String = "Hello"
// it can't be later assigned to a  = 20
// what is type inference then
//there is two ways of declaring a variable
// var a:String = "Hello
// and other is
// var a = "Hello"
// in second declaration
// the compiler will infer or find out the type of variable a
// based upon the value assigned to it
fun main(args: Array<String>) {
    var a = "Hello"
    val b = "Hello"
    //b = "Hello Again"
}