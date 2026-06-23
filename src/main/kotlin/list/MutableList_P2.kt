package list

class MutableList_P2 {
}

fun main() {

    val studentList: MutableList<Student> = mutableListOf()

    // Add multiple students
    studentList.addAll(
        listOf(
            Student("Hak Kid", 21, "Kandal"),
            Student("Seyy Kid", 21, "Takeo"),
            Student("Tinn Kid", 20, "TBK"),
            Student("Nith Kid", 20, "KPS")
        )
    )

    println("=== Student List ===")

    studentList.forEach {
        println("${it.name} - ${it.age} - ${it.address}")
    }

    println("\n=== Add New Student ===")

    val newStudent = Student(
        name = "Hak Kid",
        age = 22,
        address = "KD"
    )

    // Check duplicate name
    val exists = studentList.any {
        it.name.equals(newStudent.name, ignoreCase = true)
    }

    if (exists) {
        println("Student '${newStudent.name}' already exists!")
    } else {
        studentList.add(newStudent)
        println("Student added successfully!")
    }

    println("\n=== Final Student List ===")
    studentList.forEachIndexed { index, student ->
        println(
            "${index + 1}. ${student.name} - ${student.age} - ${student.address}"
        )
    }
}