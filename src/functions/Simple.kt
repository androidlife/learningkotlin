package functions

//by default the return type is Kotlin.Unit

fun doSomething() {
    println("Doing Something")
}

//or we can write the same as
//so we can specify the return value or not mention return
fun doSomething1(): Unit {
    println("Doing something 1")
}

//this is function with default parameters
fun addSomething(a: Int, b: Int = -10): Int {
    return a + b
}

fun addSomething1(a: Int = 20, b: Int = 30) {
    a + b
}

//this is same as above which is adding two integers and returning something
fun addAgain(a: Int, b: Int) = a + b

var a = fun(a: Int, b: Int): Int {
    return a + b
}

//parameters with default value in the middle and how to access it
fun printDetails(name: String, email: String = "sanimap@gmail.com", age: Int) {
    println(name + email + age)
}

fun main(args: Array<String>) {
    doSomething()
    println(addSomething(10, 20))
    println(addSomething(10))
    println(addAgain(5, 5))
    println(a(10, 10))
    addSomething1()
    addSomething1(10, 10)
    printDetails("Santosh", age = 20)

    //or with the arguments name, you can pass in any order you like
    printDetails(age =30,name = "Santosh",email = "sanimap@gmail.com")
    //
    printMoreArgs("Hello","Hello1","Hello123")
    someMoreArgs("Hi","There","How are you")
}
//passing same arguments as a list of values
fun someMoreArgs(vararg strings:String){
    printMoreArgs(*strings)
}
fun printMoreArgs(vararg  strings:String){
    for(someVal in strings)
        println(someVal)
}