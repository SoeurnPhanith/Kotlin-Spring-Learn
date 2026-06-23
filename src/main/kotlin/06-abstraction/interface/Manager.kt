package org.example.`06-abstraction`.`interface`

class Manager(var name:String, var baseSalary: Double) : Payable {
    override fun pay(amount: Double) {
        println("$name ទទួលទឹកប្រាក់ចំនួន $amount ដុល្លា")
    }

    fun monthlySalary() : Double {
        return baseSalary + baseSalary * 0.4;
    }
}

fun main(args: Array<String>) {

    val mg = Manager("ធីតា", 1000.00);
    val em = Employee("ដារា", 570.00);

    mg.pay(mg.monthlySalary())
    em.pay(em.monthlySalary())

}