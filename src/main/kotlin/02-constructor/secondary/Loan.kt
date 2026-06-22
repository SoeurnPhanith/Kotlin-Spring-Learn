package org.example.constructor.secondary

class Loan {

    lateinit var loandId: String
    lateinit var customerName: String
    var amount: Double = 0.0
    var interestRate: Double = 0.0
    var durationInMonths : Int = 0
    var approved : Boolean = false

    //create secondary constructor
    constructor(
        loanId: String, customerName: String,
        amount: Double, interestRate: Double,
        durationInMonths: Int, approved : Boolean
    ) {
        this.loandId = loanId
        this.customerName = customerName
        this.amount = amount
        this.interestRate = interestRate
        this.durationInMonths = durationInMonths
        this.approved = approved
    }

    //business logic flow of loan of loan
    fun calculatePayable() : Double{
        val interest = (amount * interestRate / 100) * durationInMonths/12

        return amount + interest
    }

    fun showLoanInfo() {
        println("========== LOAN INFO ==========")
        println("Loan ID     : $loandId")
        println("Customer    : $customerName")
        println("Amount      : $$amount")
        println("Interest    : $interestRate%")
        println("Duration    : $durationInMonths months")
        println("Approved    : $approved")
        println("Total Pay   : $${calculatePayable()}")
        println("================================")
    }
}

fun main(args: Array<String>) {

    // create an instance of class Loan

    val loan = Loan(
        loanId = "laon00ac1", customerName = "Sem Sino",
        amount = 5000.00, interestRate = 7.50,
        durationInMonths = 10, approved = true
    )
    loan.showLoanInfo()

    val loan3 = Loan(
        loanId = "LN003",
        customerName = "Bopha",
        amount = 10000.0,
        interestRate = 15.0,
        durationInMonths = 36,
        approved = true
    )
    loan3.showLoanInfo()



}
