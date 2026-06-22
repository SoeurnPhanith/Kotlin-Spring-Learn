package `05-polymorphism`.overriding

class CardPayment : Payment() {

    override fun pay(amount: Double) {
        println("💳 Card Payment (processing fee added)")
        println("Total: ${amount + 2}")
    }

}