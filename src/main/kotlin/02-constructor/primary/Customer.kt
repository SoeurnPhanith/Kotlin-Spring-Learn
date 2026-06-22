package org.example.constructor.primary

class Customer(
    val customerId: String,
    val fullName: String,
    val phone: String,
    val email: String
) {

    fun showCustomerInfo() {
        println("=== CUSTOMER INFO ===")
        println("ID    : $customerId")
        println("Name  : $fullName")
        println("Phone : $phone")
        println("Email : $email")
    }
}