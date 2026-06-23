package org.example.`06-abstraction`.`interface`

class Employee(var name:String, var baseSalary: Double ) : Payable {

    override fun pay(amount: Double) {
        println("$name ទទួលទឹកប្រាក់ $amount ដុល្លា");
    }

    fun monthlySalary() : Double {
        return baseSalary + baseSalary * 0.2;
    }

}