package `03-object`

object AppConfig {

    val appName = "Student Management Application"
    val version = "0.1.0"
    val apiUrl = "https://jsonplaceholder.typicode.com/"

}


fun main() {

    val app = AppConfig

    println("app name    : ${app.appName}")
    println("app version : ${app.version}")
    println("app apiUrl  : ${app.apiUrl}")

    //or
    println()

    println("app name     : ${AppConfig.appName}")
    println("app version  : ${AppConfig.version}")
    println("app apiUrl   : ${AppConfig.apiUrl}")

}