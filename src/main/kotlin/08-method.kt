package org.example

fun main(){

    //invoking
    greeting()
    sum()
    showUsername("Phanith Soeurn")
    loginSystem("root", "root168")
    println(add(1.2f,1.9f))
    println("Max value is : " + findMax(0.1,6.2,7.7))
    println(calculate(9.9, 1.1))
    println(fullname("Soeurn", "Phanith"))
    userInfo(name = "Phanith Soeurn", age = 23, country = "Cambodia")

}

//1. Non-return with no parameter
fun greeting(){
    println("Hello World!")
}
fun sum(){
    var value_a : Int = 10
    var value_b : Int = 20

    val s = value_a + value_b

    println("Result is $s")
}


//2. Non-return with parameter
fun showUsername(username : String){
    println("My username is : $username")
}
fun loginSystem(email: String, password: String){
    if(email == "root"){
        if(password == "root168"){
            println("success")
        }else{
            println("Wrong password!")
        }
    }else{
        println("Wrong email!")
    }
}


//3. return function with parameter
fun add(f_value : Float, s_value : Float) : Float{
    return f_value + s_value;
}
fun findMax(a: Double, b: Double, c:Double) : Double{
    if(a > b && a > c){
        return a;
    }
    else if(a < b && b>c){
        return b;
    }
    return c;
}


//4. Expression function
fun calculate(x: Double, y: Double) : Double = x * y
fun fullname(first_name: String, last_name: String) = "$first_name $last_name"


//5. named function
fun userInfo(name: String, age: Int, country: String) {
    println("$name $age $country")
}

