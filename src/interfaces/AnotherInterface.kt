package interfaces

open class Machine {

}

interface MachineWorks {
    fun doSomeMachineWork()
}

class Vaccum : Machine(), MachineWorks {
    override fun doSomeMachineWork() {
    }

}

open class Construct(var someVal: String) {

}

class Worker(var type: String) : Construct(type) {

}