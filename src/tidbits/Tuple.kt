package tidbits

//tuple was dropped in Kotlin some version
// and a pair and triple was introduced to make
//return values of two or threes

fun countryPopulation(name: String): Pair<String, Long> {
    return when (name) {
        "Madrid" -> Pair("SPAIN", 200000)
        else -> Pair("NO COUNTRY", 0)
    }
}

fun countryInfo(name: String): Triple<String, String, Long> {
    return when (name) {
        "Madrid" -> Triple("SPAIN", "EUROPE", 100000)
        "KTM" -> Triple("NEPAL", "ASIA", 2000)
        else -> Triple("NO COUNTRY", "NO", 0)
    }
}

//deconstructing values
// means presenting the pair and triple information in more concise manner
fun main(args: Array<String>) {
    val pair: Pair<String, Long> = countryPopulation("Madrid")
    println(pair.first)
    println(pair.second)
    //above it is very hard to know what is type of first value
    //or to say what first value represent and what second value represents

    val (country: String, population: Long) = countryPopulation("Madrid")
    println(country)
    println(population)
    //being data data class, it is simply asking getComponentName
    val (name, capital, populations, latitue) = Country("SPAIN", "MADRID", 2000, 20.345)
    println(name)
    println(latitue)

    var somelist: List<Pair<String, String>> = listOf(Pair("Spain", "Madrid"), Pair("Nepal", "Ktm"), "France" to "Paris")
    for ((country: String, capital: String) in somelist)
        println(country + " " + capital)
}

data class Country(var name: String, var capital: String, var population: Long, var latitude: Double) {

}