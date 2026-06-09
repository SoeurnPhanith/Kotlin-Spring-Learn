package org.example

///Null Safety គឺជា feature សំខាន់មួយរបស់ Kotlin ដែលជួយការពារ NullPointerException
// ដោយធ្វើឲ្យ compiler ត្រួតពិនិត្យ null តាំងពីពេល compile time
fun main(){

    //1. ? Nullable
    var username : String?
    username = null

    print("Username : ${username}")


    //2. ?. Nullable safe with propoty or method
    val name: String? = null

    println(name?.length)


    //3. ?: use when want to change word null to 0 -> 0
    var nickname : String?
    nickname = "" //or null

    val len = nickname?.length ?: 0
    println("Length of nickname : $len")



}