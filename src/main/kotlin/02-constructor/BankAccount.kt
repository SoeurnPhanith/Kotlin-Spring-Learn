package `02-constructor`

class BankAccount(
    val accountNumber: String,
    val owner : String,
    private var balance: Double = 0.0
) {

    constructor(accountNumber: String, owner: String)
            : this(accountNumber,  owner, 0.0)

    init {
        require(balance >= 0){
            "សមតុល្យដើមមិនអាចតិចជាងសូន្យបានទេ"
        }
        println("គណនីលេខ ${accountNumber} របស់ ${owner} បានបង្កើតឡើងដោយមានសមតុល្យ")
    }

    fun deposit(amount: Double) {
        require(amount >= 0){"ចំនួនទឹកប្រាក់ត្រូវតែធំជាងសូន្យ"}
        balance += amount;
    }

    fun checkBalance() : Double = balance
}

fun main(){
    val accountA = BankAccount("AC-001", "សុផា", 10.00)
    val accountB = BankAccount("AC-002", "ចាន់ថា")

    accountB.deposit(1.00);
    println()

    println("ចំនួនទឹកប្រាក់សរុប របស់${accountA.owner}: ${accountA.checkBalance()}0$")
    println("ចំនួនទឹកប្រាក់សរុប របស់${accountB.owner}: ${accountB.checkBalance()}0$")
}