package practise

sealed class WithDrawStatus {

    data class Success(val remaining : Double) : WithDrawStatus()

    data class Failure(val reason : String) : WithDrawStatus()

}