package basics

fun main(args: Array<String>) {
    val multilineString = """
        Hello how
        are you
        doing
        """
    //instead of
    val mutilineString1 ="Hello how\n"+
            "are you\n"+
            "doing"
    println(multilineString)
    println("-----------")
    println(mutilineString1)
    stringNFunctionInterpolation()
}

fun stringNFunctionInterpolation(){
    val name = "NSW"
    //string interpolation
    println("The name = $name")
    //function interpolation
    println("The lenght of $name = ${name.length}")
}