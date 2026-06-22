package `05-polymorphism`.overriding

class MobilePayment : Payment(){

    override fun pay(amount: Double) {
        println("📱 Mobile Payment successful")
        println("Amount: $amount")
    }


}