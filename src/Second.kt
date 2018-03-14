class Person(firstName: String) {
    fun printName(){
        println("This is Person first name")
    }
}

class Employee(firstName: String, age: Int) {
    fun printName(){
        println("This is Employee first name")
    }
}

fun main(args: Array<String>) {
    var person:Person = Person("PERSON")
    person.printName()
    var employee:Employee = Employee("Tom",20)
    employee.printName()
}
