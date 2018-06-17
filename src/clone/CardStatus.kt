package clone

class CardStatus(var status:String,var code:Int):Cloneable{
    public override fun clone(): CardStatus {
        return super.clone() as CardStatus
    }
}