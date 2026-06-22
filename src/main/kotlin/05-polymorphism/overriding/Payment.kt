package `05-polymorphism`.overriding

//open == allow inheritance

open class Payment {

    open fun pay(amount: Double){
        println("Processing payment amount $amount")
    }

}