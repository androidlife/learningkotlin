package classes

//in Kotlin we don't have to explicitly declare getters and setters
// as a different function
class SomeGetterSetter {
    var someName: String = ""
        get() {
            return if (someName.isEmpty())
                "EMPTY"
            else
                someName
        }
        set(value) {
            //here value is like
            // any input that comes from someGetterSetterObj.someName = "Do Something"
            //and if we override this function
            // we need to explicity assign the value
            // for that we have some backing field
            //don't know what do you mean by backing field
            // the field references someName in some way
            // here it is reduntant creating a setter
            field = value
        }
}