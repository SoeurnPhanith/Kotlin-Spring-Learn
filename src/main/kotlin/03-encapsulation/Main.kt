package `03-encapsulation`

class Main {
}

fun main(){
    val bankService = BankService()

    //late init now init manually
    bankService.initAccountService(AccountService())

    bankService.deposit(100.00)
}
