package lambda

enum class BpayConfig {
    WithAdHocOnly,
    WithoutAdHoc,
    WithSingle,
    WithRecurring,
    Both
}

enum class PayMyCardConfig {
    WithAdHocOnly,
    WithoutAdHocOnly,
    Both
}


class AdHoc {
    var enabled = true
    operator fun invoke(fn: AdHoc.() -> Unit): AdHoc {
        fn()
        return this
    }
}

class Recurring {
    var enabled = true
    operator fun invoke(fn: Recurring.() -> Unit): Recurring {
        fn()
        return this
    }
}


open class Pay(val adHoc: AdHoc, val recurring: Recurring) {
    var enabled = true
    fun isAdHocEnabled() = adHoc.enabled
    fun isRecurringEnabled() = recurring.enabled
    operator fun invoke(fn: Pay.() -> Unit): Pay {
        fn()
        return this
    }
}

class Bpay(adHoc: AdHoc, recurring: Recurring) : Pay(adHoc, recurring)
class PayMyCard(adHoc: AdHoc, recurring: Recurring) : Pay(adHoc, recurring)


class PaymentConfig(val bpay: Bpay, val payMyCard: PayMyCard) {
    var enabled = true
    operator fun invoke(fn: PaymentConfig.() -> Unit): PaymentConfig {
        fn()
        return this
    }
}

fun createPaymentConfig(fn: PaymentConfig.() -> Unit): PaymentConfig {
    val adHoc = AdHoc()
    val recurring = Recurring()
    val bpay = Bpay(adHoc, recurring)
    val payMyCard = PayMyCard(adHoc, recurring)
    val paymentConfig = PaymentConfig(bpay, payMyCard)
    fn(paymentConfig)
    return paymentConfig
}

fun main(args: Array<String>) {
    createPaymentConfig {
        enabled = false
        bpay {
            adHoc {
                enabled = false
            }
            recurring {
                enabled = true
            }
        }
        payMyCard {
            adHoc {
                enabled = true
            }
            recurring {
                enabled = false
            }
        }
    }
}