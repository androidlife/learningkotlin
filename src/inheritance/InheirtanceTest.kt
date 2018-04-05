package inheritance

//by default this is public final class Person, which can't be inherited
class Person {

}

//this can't be done
//class Custom:Person(){
//
//}

//so by doing open we are creating inheritable classes
open class Person1 {
    //by default this function is also final and can't be overridden
    fun doSomething() {

    }

    open fun doSomething1() {

    }

    open fun doAnother() {

    }
}

open class Customer : Person1() {
    //this can't be done as doSomething is not open to anything
//    override fun doSomething() {
//
//    }
    override fun doSomething1() {
        super.doSomething1()
    }

    //by doing this we are not allowing
    //it's inherited class to access this function
    final override fun doAnother() {
        super.doAnother()
    }
}

class GoodCustomer : Customer() {
    override fun doSomething1() {
        super.doSomething1()
    }
}

//let's see inheritance with help of constructor with arguments

open class First(name: String, age: Int) {


}

open class Second : First("", 20) {

}