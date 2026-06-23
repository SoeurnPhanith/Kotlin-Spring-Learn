
import `02-sealed class`.LoginService

sealed class LoginResult {

    object Loading : LoginResult()

    data class Success(val token: String, val username: String) : LoginResult()

    data class Error(val message: String) : LoginResult()

    object EmptyInput : LoginResult()

}

fun handleResult(result: LoginResult) {

    when (result) {

        is LoginResult.Loading -> {
            println("⏳ Loading...")
        }

        is LoginResult.Success -> {
            println("✅ Login Success!")
            println("Username: ${result.username}")
            println("Token: ${result.token}")
        }

        is LoginResult.Error -> {
            println("❌ Error: ${result.message}")
        }

        LoginResult.EmptyInput -> {
            println("⚠️ Please enter username and password")
        }
    }
}

fun main() {

    val lgService = LoginService()

    var result = lgService.login("phanith", "admin123")

    handleResult(result)

}