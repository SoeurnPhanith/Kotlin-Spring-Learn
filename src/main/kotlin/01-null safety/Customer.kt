package org.example.`01-null safety`

data class Customer(val name: String, val email: String)

fun setNotification(customer: Customer) {

    val emailToUse = customer.email ?: "no-reply@bank.com"
    println("Sent to email ${emailToUse}")

    val domain = customer.email?.substringAfter('@')?.uppercase()
    println("Domain: ${domain ?: "N/A"}")
}

fun main(){
    setNotification(Customer("Nith", "phanithsoeurn371@gmail.com"))
}