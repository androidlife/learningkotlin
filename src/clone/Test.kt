package clone

fun main(args: Array<String>) {
    val cards = mutableListOf<BaseCard>()
    val creditCard = CreditCard()
    creditCard.cardName = "Credit Card"
    creditCard.cardStatus = CardStatus("Credit", 100)
    creditCard.cardType = CardType.Credit
    cards.add(creditCard)

    val loanCard = LoanCard()
    loanCard.cardName = "Loan Card"
    loanCard.cardStatus = CardStatus("Loan", -100)
    //loanCard.cardType = CardType.Loan
    cards.add(loanCard)


    val loanBaseCard = cards[1].clone()
    println(loanBaseCard is LoanCard)
    loanBaseCard.cardStatus.code = -200
    loanBaseCard.cardName = "Loan Base Card"
    //loanBaseCard.cardType = CardType.Credit


    println("loanCard cardName=${loanCard.cardName}, cardStatus.code=${loanCard.cardStatus.code}")
    println("loanBaseCard cardName=${loanBaseCard.cardName}, " +
            "cardStatus.code=${loanBaseCard.cardStatus.code}")

}

enum class CardType {
    Loan, Credit
}