package list

class List_P2 {}

fun main(){

    var studentList = ArrayList<Student>(
        listOf<Student>(
            Student("Julain", 25, "MLBB"),
            Student("John", 21, "MLBB"),
            Student("Ling", 22, "MLBB"),
            Student("alex", 23, "EU"),
        )
    )

    //access using iterator loop
    for(s in studentList){
        println(" ${s.name}  -  ${s.address}")
    }

    //normal access
    println(studentList)

    //using foreach to access
    studentList.forEach {
        s -> println("--- ${s.name}, ${s.age}, ${s.address}")

    }

    //filter student list
    var filteredByAge = studentList.filter {
        s -> s.age < 25
    }
    for(stuFilter in filteredByAge){
        println(" ===> ${stuFilter.name} ,  ${stuFilter.age}")
    }

    //find one student in list
    var stu = studentList.find {
        student -> student.address == "EU"
    }
    println(stu)

}