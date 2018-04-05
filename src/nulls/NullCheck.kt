package nulls

fun main(args: Array<String>) {
    //by default in Kotlin, type can't be null
    //val someName:String =null
    // meaning if any variable has some type, we can't
    // set it to null
    //if not typecasted seems like we can set it to null
    val otherName = null
    println(otherName)
    //but if we want the type to be null we add in
    // following manner
    //it is just saying that this variable can hold null
    //this same happens for function as well
    val nullName: String? = null
    // this is same as doing
    //val nullName =null
    //so seems like this can't be done
    // it seems like compile time check
    //println(nullName.length)
    if (nullName != null) {
        println("Not null")
    } else {
        println(nullName?.length)
    }
    //if we need servie
//    var serviceProvider:ServiceProvider = ServiceProvider()
//    if(serviceProvider.getService() !=null){
//        var service:Service = serviceProvider.getService()
//        if(service.getServiceType() !=null)
//            println(service.getServiceType())
//    }
    //but this all can be reduced with simple this
    println(ServiceProvider().getService()?.getServiceType())
    //seems like it always checks null before proceeding further
    //if not null proceeds further else terminates the sequence
    //but what if we don't want kotlin to interfere with anything
    //meaning we will be responsible for our own mess
    //and leave the kotlin compiler to do anything
    // we know that nullName is null here, but we will handle
    //nullpointer exception if arrives
    //for that we require !!, saying hey kotlin skip checking
    //null for me
    //this will crash our app
    println(nullName!!.length)


}

//this is indicating that this method can return string
fun provideString(a: Int): String? {
    if (a > 10)
        return "GOOD"
    return null
}

class Service {
    fun getServiceType(): String? {
        return "TYPE"
    }
}

class ServiceProvider{
    fun getService():Service?{
        return Service()
    }
}