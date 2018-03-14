package basics

fun main(args: Array<String>) {

    for (a in 1..10)
        println(a)
    val someList = 1..10
    for (a in someList)
        println(a)
    for (a in 10 downTo 1)
        println(a)

    for (a in 10 downTo 1 step 2)
        println(a)

    val countries = listOf<String>("Nepal", "China", "Bhutan", "India")
    for (country in countries)
        println(country)

    //creating label
    someLoopLabel@ for (i in 3..10) {
        for (j in 10 downTo 1) {
            println(j)
            if (j % i == 0)
                break@someLoopLabel
        }
    }
}