package genericss

open class Vehicle

class Train : Vehicle()


/**
 * When declared as in,
 *  we can't make T as return type
 *  i.e. we can't do
 *  addAll():List<T>
 *      or
 *  add():T
 */
interface AddLocomotive<in T> {
    fun addAll(items: List<T>)
    fun add(item: T)
}

/**
 * When declared as out,
 * we can't add as arguments
 * getAll(items:List<T>)
 * or get(item:T) can't be done
 * WHY???
 */
interface GetLocomotive<out T> {
    fun getAll(): List<T>
    fun get(): T
}

interface SeeLocomotive<T> {
    fun seeAll(items: List<T>)
    // if we comment below, we will get some wiggly indicator
    // does this mean that the interface we have created has only
    // in indicator
    // and when we uncomment below, the wiggly indicator
    // dissapears
    //fun getAll():List<T>
}

fun main(args: Array<String>) {
    val vehicles = listOf(Vehicle(), Vehicle())
    operate(vehicles)
    val trains = listOf(Train(),Train())
    operate(trains)
}

fun operate(items: List<Vehicle>) {

}