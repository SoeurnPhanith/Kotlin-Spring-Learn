package list

import com.sun.org.apache.xpath.internal.operations.Bool
import kotlin.collections.mutableListOf

//MutableList == dynamic list

class MutableList_P1 {}

fun main() {

    ///declaration of mutableList
    var name : MutableList<String> = mutableListOf()
    val fruit = mutableListOf<String>()

    ///add data to list
    name.add("Phanith")
    name.add("Tin")
    name.add(2, "Piseyyy")

    name.forEach { n->println(n) }

    ///update element
    name[1] = "Tin Tin"
    println(name)

    ///add many data in same time
    name.addAll(listOf(
        "Dara", "Mara", "Sopheab"
    ))
    name.forEach { n->println(n) }

    ///remove with your condition
    name.removeIf {
        n -> n.lowercase().startsWith("p")
    }
    name.forEach { n->println("-----$n") }

    ///find data
    var f = name.find { n -> n.lowercase().startsWith("t") }
    println(f)

    ///filter for what you want
    var filter = name.filter { it.lowercase().endsWith("a") }
    filter.forEach { n->println(n) }

    ///delete
    name.remove(filter.last())

    ///method to use
    /*
        find()
        filter()
        map()
        any()
        count()
        firstOrNull()
        removeIf()
        groupBy()
        associateBy()
        sortedBy()
    */


}