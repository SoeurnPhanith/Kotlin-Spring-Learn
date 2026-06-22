package org.example.constructor.primary

fun main(args: Array<String>) {

    //set 2 customer
    var customer = Customer("001t", "Soeurn Phanith", "0312172697", "phanith@gmail.com")
    var cus = Customer("002t", "Soeurn Channen", "021954423", "channen@gmail.com")


    // add 2 account for customer
    var account = Account("AC0001", customer, 15.00)
    var acc = Account("AC0002", cus, 1.20)
    println()

    account.showAccount()
    acc.showAccount()

    //account customer 1 pay money to account customer 2
    var transaction = Transaction(
        transactionId = "tns00x1",
        fromAccount = account,
        toAccount = acc,
        amount = 5.0
    )
    transaction.executeProcess()

}