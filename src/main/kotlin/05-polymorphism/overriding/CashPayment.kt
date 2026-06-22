package `05-polymorphism`.overriding

class CashPayment : Payment() {

    override fun pay(amount: Double) {
        println("💵 Cash Payment: $amount")
    }

}