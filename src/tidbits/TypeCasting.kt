package tidbits

open class Worker {
    fun printWorker() {
        println("WORKER")
    }

}

open class Employee : Worker() {
    fun takeLeave(leaveDays: Int) {
        if (leaveDays < 30)
            println("Dude you seriously need to take leave")
    }
}

open class Contractor : Worker() {

}

fun checkLeave(worker: Worker) {
    //this is called smart casting
    // here we are not explicitly casting the worker
    // as employee
    // the compiler is smart enough to do that for us
    if (worker is Employee)
        worker.takeLeave(10)
    else
        worker.printWorker()
}