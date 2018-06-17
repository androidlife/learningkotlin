package general

val someList = listOf('A','B','C','D','A')
fun main(args: Array<String>) {
    val other = someList.map {
        println(it)
        it.toInt()
    }

    println("After transformation")
    other.forEach{
        println(it)
    }

    val queryItem:Char? = someList.firstOrNull { it == 'A' }
    println(queryItem)
    println(someList.contains(queryItem))
}