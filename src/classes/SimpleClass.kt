package classes

class Customer() {
    var id = 10
    var name = "Unknown"
}

//class with constructor
class Employee(var id: Int, var name: String) {
    var autoId = id + 40
}

//seems like there is an init function with gets called when object is initialized
class Person(var name: String = "DEFAULT", var age: Int, address: String = "NSW") {
    init {
        System.out.println("Person Initialize")
        name += "DoSomething"
    }

    var otherName = name + "PERSON"

    //member function
    //this is just like any other function
    fun printName():String{
        return name.toUpperCase()
    }
}

//now comes the constructor overloading
//but why the heck it is making complicated or I am getting it hard to understand here
class Student(var name: String, var age: Int) {
    init {
        System.out.println("STUDENT INITIALIZED")
    }

    //var on secondary constructor is not allowed
    //constructor(var email:String):this("SomeStudent",20)
    // is not allowed
    //but WHY???
    constructor(email: String) : this("SomeStudent", 20) {
        System.out.println("STUDENT SECONDARY CONSTRUCTOR CALLED")
    }
    //this is similar to the concept
    //constructor(String name)
    //constructor(int age){
    // this("Hello")
    // }

    //custom getters and setters
    //since we don't have method like getAddress
    // if we want to modify something before getting the value
    //then we do similar kind of stuff like following
    var address: String = ""
        //this will cause stack overflow error
        //why
        //get()-> calls address as it wants to know the address value
        //and for that it checks the address getter
        //which is again get()
        //and this goes on and on
        get() {
            if (address.contains("ome"))
                return address.toUpperCase()
            else
                return address.toLowerCase()
        }
        //set(value) can be named anything
        //set(somevalue)
        //set(othervalue) as it contains the value passed on setter
        set(value) {
            if (value != null && value.length > 0) {
                //this is like setting address = value
                //this is also known as backing setters, getters
                field = value
            }
        }
}

fun main(args: Array<String>) {
    var customer = Customer()
    customer.id = 30
    customer.name = "Some Valuable Customer"

    var employee = Employee(10, "Tarzan")
    employee.id = 30
    println(employee.autoId)

    var person = Person(age = 10)
    person.name = "Other"
    person.age = 30
    println(person.printName())
    //this we cannot do as it is simply a value that is passed to the constructor
    //and it is not a property
    //person.address
    var student = Student("student@gmail.com")
    println(student.address)
    student.address = "Hornsby"
    println(student.address)
}