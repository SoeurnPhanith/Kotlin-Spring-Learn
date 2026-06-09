package org.example

/// in kotlin dataType&variable having 2 side :
///    1. var (mutable)
///    2. val (immutable)

///Syntax to declare variable
///   Type var_name : data_type;
fun main() {

    val id : Int = 1
    var name : String = " Soeurn Phanith "
    var age : Int = 20
    val identity : Long = 234567890;
    val role : String = " ADC "

    println(
        "Unique id : ${id}\n" +
                "Name      : ${name}\n" +
                "Age       : ${age}\n" +
                "Identity  : ${identity}\n" +
                "Position  : ${role}"
    )

}