package clone

abstract class BaseCard : Cloneable {
    lateinit var cardName: String
    lateinit var cardStatus: CardStatus
    lateinit var cardType:CardType

    public override fun clone(): BaseCard {
        val baseCard = super.clone() as BaseCard
        //baseCard.cardStatus = baseCard.cardStatus.clone()
        return baseCard
    }

    abstract fun getCardType(): String
}