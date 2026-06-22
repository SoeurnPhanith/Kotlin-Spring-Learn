package org.example

import org.example.class_object.Customers


fun main() {

    //create an instance of class Customers
    val cus = Customers()

    cus.name = "pheaktra"
    cus.age = 26
    cus.address = "Phnom Penh"

    //show result
    println("=========Customer information===============")
    println("Customer name : ${cus.name}")
    println("Customer age : ${cus.age}")
    println("Customer address : ${cus.address}")


}

/// Note : val & val when create object :
/*         1. using val when you don't to reference for change object
              ex:
                   val customer = Customers()✅
                   customer = Customers() ❌

           2. using var when you want to reference and change object
              ex:
                   var cus = Customers()✅
                   cus = Customers()✅
*/