package basics

class Mall {
    var mallName: String = ""
    //here field = mallName
    // or you can simply write mallName
        get() = "The mall name is ".plus(field)
        set(value) {
            if (!value.isNullOrEmpty())
                mallName = value
        }
}