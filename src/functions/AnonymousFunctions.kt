package functions

fun doSomeThing(x: Int, op: (Int) -> Int): Int {
    return op(x)
}

fun main(args: Array<String>) {
    //here it is lke one line statement only,
    //we can't do anything rather than just adding two numbers
    doSomeThing(10, { x -> x + x })
    doSomeThing(11, { it * it })
    //but with anonymous function
    //we are able to add some changes
    doSomeThing(10, fun(x): Int {
        if (x > 10)
            return x * x
        return x + x
    })
    //why we call anonymous is that the function
    //doesn't have any name it is simply like f(x)
    //for other case we have fun somefunctionName()
}