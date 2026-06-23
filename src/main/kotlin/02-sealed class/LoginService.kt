package `02-sealed class`

import LoginResult

class LoginService {

    fun login(username: String, password: String): LoginResult {

        //check empty
        if(username.isBlank() || password.isBlank()){
            return LoginResult.EmptyInput
        }

        //loading
        val loading = true
        if (loading) {
            println("Checking credentials...")
        }

        //when correctly
        val correctUsername = "phanith"
        val correctPassword = "admin123"

        if(username == correctUsername && password == correctPassword){
            return LoginResult.Success(
                token = "JWT_TOKEN_ABC123",
                username = username
            )

        }else{
            return LoginResult.Error("invalid username or password")
        }

    }
}