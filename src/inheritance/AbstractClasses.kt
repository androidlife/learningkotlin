package inheritance

/**
 * An abstract classs is something that can't be
 * instantiated or has object
 * and each and everything is similar to the
 * abstract class of JAVA*/
abstract class Student {
    //can have abstract methods
    abstract fun getStudentName():String
    var mathMark = 30
    fun calculateMark(){
        mathMark += 20
        println(mathMark)
    }
}

//so same thing as that of JAVA
class MasterStudent(var name:String):Student(){
    override fun getStudentName():String {
        return name
    }

}

fun main(args: Array<String>) {
    //can't create instance of an abstract class
    //var student:Student = Student()
}