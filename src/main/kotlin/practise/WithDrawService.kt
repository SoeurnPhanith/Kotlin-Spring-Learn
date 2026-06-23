package practise

class WithDrawService {

    companion object{
        fun withDraw(wallet: Wallet, amount: Double) : WithDrawStatus {
            return when{
                amount > DailyLimit.DAILY_LIMIT
                    -> WithDrawStatus.Failure("លើសកំណត់ប្រចាំថ្ងៃ ${DailyLimit.DAILY_LIMIT}")

                amount > wallet.balance
                    -> WithDrawStatus.Failure("ទឹកប្រាក់មិនគ្រប់គ្រាន់ ${wallet.balance}")

                else ->
                    WithDrawStatus.Success(wallet.balance - amount)
            }
        }
    }

}