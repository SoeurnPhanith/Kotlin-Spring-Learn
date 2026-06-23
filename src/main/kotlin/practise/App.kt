package practise

class App {
}

fun main(){

    val wallet = Wallet("Tin", 130.75, Currency.USD)
    val withdraw = WithDrawService.withDraw(wallet, 50.5);

    when(withdraw){
        is WithDrawStatus.Failure -> println("Withdraw failed")
        is WithDrawStatus.Success -> println("Success and now in wallet ${wallet.balance}")
    }
}