package functions

fun someDefaultParameter(a:Int = 10, b:Int,c:String = "Hello"){
    println("someDefaultParameter a=$a, b= $b and c = $c")
}
fun allDefaultParameter(a:Int =10,b:Int= 20, c:String ="ALL"){
    println("allDefaultParameter a=$a b=$b and c=$c")
}

fun withUnlimitedParams(vararg strings:String){
    strings.forEach { println(it) }
}

//multiple vararg are not permitted like
//withUnlimitedParams(vararg strings:String,vararg ints:Int)
fun withUnlimitedParams1(vararg strings: String,a:Int){
    strings.forEachIndexed({index,item-> println("item at index $index = $item ")})
}

fun main(args: Array<String>) {
    someDefaultParameter(b=20)
    someDefaultParameter(a=50,b=20)
    allDefaultParameter()
    allDefaultParameter(a=30)

    withUnlimitedParams("Hello1","Hello2","Hello3")
    withUnlimitedParams1("Hello1","Hello2","Hello3",a= 20)
}