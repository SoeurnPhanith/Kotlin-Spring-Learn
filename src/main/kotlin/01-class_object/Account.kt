package org.example.class_object

//No   : 03
class Account {

     var accountNumber = " "
     var ownerName = ""
     var balance = 0.0

    // functionally
    fun deposit(amount: Double){
        if(amount <= 0){
            println("cannot deposit without amount or negative amount")
            return
        }

        balance += amount
        println("Owner deposited ${amount}$")
    }

    fun withdraw(amount: Double){
        if(amount <= 0){
            println("cannot withdraw without amount or negative amount")
            return
        }
        if(amount > balance){
            println("Insufficient Balance")
            return
        }

        balance -= amount
        println("Owner Withdrawed ${amount}$")
    }

    fun checkBalance() : Double {
        return balance;
    }

}
///Note : about lateinit keyword is cannot use with primitive data type
///       can use only non-primitive datatype

fun main(args: Array<String>) {
    //create an instance of class Amount and using when for use choosing

    val acc = Account()
    var feature : Int

    do{
        println(
            "=========== Bank ATM =============\n" +
                    "1.  Deposit                       \n" +
                    "2.  Withdraw                      \n" +
                    "3.  Check Balance                 "
        )

        print("What do you want to do in this ATM ? : ")
        feature = readLine()!!.toInt()

        when (feature) {
            1 -> {
                println("\n============ Deposit ==============")

                print("Deposit ? $ : ")
                val dep = readLine()!!.toDouble()

                acc.deposit(amount = dep)
            }
            2->{
                println("\n============ Withdraw ==============")

                print("Withdraw ? $ : ")
                val wd = readLine()!!.toDouble()

                acc.withdraw(amount = wd)
            }
            3-> {
                println("\n============ Check Balance ============")
                print("Balance ${acc.checkBalance()}$ ")
            }
        }
    }while(feature != 0)


}