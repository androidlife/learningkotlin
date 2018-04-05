package genericss

interface Repository<T> {
    fun store(t: T)
    fun getFromId(id: Int): T
}

class Person : Repository<Person> {
    override fun store(t: Person) {

    }

    override fun getFromId(id: Int): Person {
        return Person()
    }
}

class Employee : Repository<Employee> {
    override fun getFromId(id: Int): Employee {
        return Employee()
    }

    override fun store(t: Employee) {
    }

}

interface Repo {
    fun <T> getById(id: Int): T
    fun <R> getAll(): R
}


