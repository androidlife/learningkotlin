package classes

//sealed classes are like enums
//but they add dynamic values to it ( one of the use case )
// may be other stuff are also there, but I don't know at this stage

enum class ViewState(val viewData: ViewData){
    Error(ViewData(10,"Error")),
    Loading(ViewData(20,"Loading")),
    Success(ViewData(30,"Loading list of data"))
}

//the above enum looks dynamic, but if we want a
// success enum which can hold variety of ViewData
// may be a list of Customers
// may be a list of employeers
//then it fails
//enums by default are constants and their type is also constants
class ViewData(val code:Int,val state:String)


sealed class ViewStateS(){
    class Error:ViewStateS()
    class Loading:ViewStateS()
    class Success(val viewData: ViewData):ViewStateS()
}
//here we are creating a success class
// which doesn't require a predefined value beforehand
// we can create ViewStateS Success on the fly with dynamic values


fun main(args: Array<String>) {
    //can't do with any dynamic values
    withViewState(ViewState.Error)
    withViewState(ViewState.Loading)
    withViewState(ViewState.Success)

    //but here we can work with some dynamic  values
    //being a class, the object is always a new one
    // but in enum, there will be a singleton instance only
    //this approach if not taken cared of chance is that we will
    // create multiple Objects
    withViewStateS(ViewStateS.Error())
    withViewStateS(ViewStateS.Loading())
    withViewStateS(ViewStateS.Success(ViewData(30,"Loading List of Customers")))
    withViewStateS(ViewStateS.Success(ViewData(40,"Loading List of Employees")))


}

fun withViewState(viewState: ViewState){
    when(viewState){
        ViewState.Error -> println("Error")
        ViewState.Loading -> println("Loading")
        ViewState.Success -> println(viewState.viewData.state)
    }
}

fun withViewStateS(viewStateS: ViewStateS){
    when(viewStateS){
        is ViewStateS.Error -> println("Error")
        is ViewStateS.Loading -> println("Loading")
        is ViewStateS.Success -> println(viewStateS.viewData.state)
    }
}