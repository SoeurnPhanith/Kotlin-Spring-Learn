package org.example.constructor.primary

class Account(
    val accountNo: String,
    val owner: Customer,
    var balance: Double
) {

    fun deposit(amount: Double) {
        balance += amount
        println("${owner.fullName} deposited $$amount")
        println("New Balance = $$balance")
    }

    fun withdraw(amount: Double) {

        if (amount > balance) {
            println("❌ Insufficient balance")
            return
        }

        balance -= amount
        println("${owner.fullName} withdrew $$amount")
        println("New Balance = $$balance")
    }

    fun showAccount() {
        println("=== ACCOUNT INFO ===")
        println("Account No : $accountNo")
        println("Owner      : ${owner.fullName}")
        println("Balance    : $$balance")
    }
}