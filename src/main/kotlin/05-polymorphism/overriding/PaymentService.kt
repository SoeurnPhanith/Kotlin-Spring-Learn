package `05-polymorphism`.overriding

class PaymentService {

    //reusable method with different type class
    fun processPayment(payment: Payment, amount: Double) {
        payment.pay(amount)
    }

}

fun main(args: Array<String>) {

    val service = PaymentService()

    service.processPayment(CardPayment(), 11.15)
    service.processPayment(CashPayment(), 99.00)
    service.processPayment(MobilePayment(), 25.55)


}