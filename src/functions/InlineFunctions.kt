package functions

fun doingWithOtherFunctions(someInt: Int, op: (Int) -> Int) {
    op(someInt)
}

inline fun doingWithOtherFunctionsInline(someInt: Int, fn: (Int) -> Int) {
    fn(someInt)
}

fun doingWithAnotherFunction(someInt: Int, fn: (Int, Int) -> Int) {
    fn(20, 30)
}

//here it doesn't make sense
//as inline is for the functional argument, where we don't
// want to create the instance of the function
//Q) What is the instance of the function
//so in the function below, if we are not inlining anything
// adding inline is of no use
inline fun workingWithNoInline(noinline fn: () -> Unit) {
    fn()
}

//or we can do the following
//here we are saying that we don't want to inline
//the first argument, but we need inlining of second
// argument
inline fun workingWithNoInline(noinline fn: () -> Unit, fn1: () -> Unit) {

}

//similary while doing inlining we can't reference the passed argument
//this can't be done
// whY?
inline fun workingWithReference(fn: () -> Unit) {
    val someFn = fn
    println("Do something")
    fn()
}

fun main(args: Array<String>) {
    //this is something like lambda expression
    //here we are just writing the body of the function
    // where it -> param passed as argument
    doingWithOtherFunctions(10, { it * it })
    //the only difference here is that  the other function
    // is with inline type
    // so what does inline do
    // to understand that you need to look upon the decompiled
    // kotlin class for this file
    //right now I have kept InlineFunctionDecompiled.java to understand more
    // look upon the static main() function where these two are  invoked
    //inling works for lambda parameters mainly for the function that has argument has function
    // inlining is optimization process where we are explicitly
    //saying that please don't create an instance of the function,
    // simply paste the content of function directly
    // so if we try to inline any other function that doesn't
    // have function as argument, then it makes no sense
    // ie. no optimization is needed there
    doingWithOtherFunctionsInline(20, { it * it })
    //I couldn't do {it*it1} format for the below function
    // does it mean, that it is for functions with single
    //arguments only
    //doingWithAnotherFunction(20,{it*it})

}