package `03-encapsulation`

class BankService {

    //lateinit -> will be injection later
    lateinit var _service : AccountService;

    //lazy -> create only when first use
    val transactionRepo : TransactionRepository by lazy { -> TransactionRepository() }

    //injection AccountService
    public fun initAccountService(service: AccountService){
        _service = service;
    }

    fun deposit(amount : Double){
        if(amount <= 0.0){
            println("Insufficient funds")
            return
        }
        _service.processDeposit(amount);
        transactionRepo.saveTransaction(amount);
    }

}