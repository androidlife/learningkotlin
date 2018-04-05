package classes

abstract  class FirstAbstract{
    abstract fun doSthAbstract()
}

data class Second(var name:String): FirstAbstract() {
    override fun doSthAbstract() {
    }

}