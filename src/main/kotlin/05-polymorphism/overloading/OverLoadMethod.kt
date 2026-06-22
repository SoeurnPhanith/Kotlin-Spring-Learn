package `05-polymorphism`.overloading

class OverLoadMethod {

    fun add(a: Int, b: Int) = a + b

    fun add(a: Double, b: Double) = a + b

    fun add(a: Int, b: Int, c: Int) = a + b + c

    fun add(a: Float, b: Float) = a + b

    fun add(a: Long, b: Long) = a + b

}

fun main(){

    val ol = OverLoadMethod()

    println(ol.add(2,6)) //int
    print(ol.add(9L,6L))  //long

    println(ol.add(91.2,6.99))//long
    println(ol.add(91.2F,6.99F)) //float

    println(ol.add(9,5,9))

}