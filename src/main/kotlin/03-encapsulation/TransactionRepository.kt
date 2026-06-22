package `03-encapsulation`

class TransactionRepository {

    init {
        "Transaction Repository Created"
    }

    fun saveTransaction(amount : Double) {
        println("Saving Transaction : $amount")
    }

}