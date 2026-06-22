package org.example.constructor.primary

//This class is using Primary Constructor Part1
//Primary constructor write on head of class nas using init{ }
// init {} == initilize block it's work when create object


class Transaction(
    val transactionId: String,
    val fromAccount: Account,
    val toAccount: Account,
    val amount: Double
) {

    fun executeProcess(){

        println("+++ Execute Starting Transaction +++")
        if(fromAccount.balance < amount){
            println("❌ Transaction Failed: Not enough money")
            return
        }

        fromAccount.withdraw(amount)
        toAccount.deposit(amount)

        println("Transaction ID: $transactionId completed")
        println("Amount: $$amount")

        println("=== TRANSACTION END ===")
    }

}