package functional

//functional programming building block will be a function
// here , a function can take argument as a function
// similarly a function return type can also be a function

fun addSth(a: Int, b: Int): Int {
    return a + b
}

fun goingFunctional(a: Int, b: Int, op: (Int, Int) -> Int) {
    println(op(a, b))
}

fun unaryOperation(a: Int, op: (Int) -> Int) {
    println(op(a))
}

fun main(args: Array<String>) {
    goingFunctional(10, 20, ::addSth)
    //or we can use short expression for this as well
    goingFunctional(10, 20, { x: Int, y: Int -> x * y })
    val someAddition: (Int, Int) -> Int = { x, y -> x + y }
    //we can write in two variations
    unaryOperation(10, { x: Int -> x * x })
    //or we can use the first argument as it
    unaryOperation(10, { it * it })
}