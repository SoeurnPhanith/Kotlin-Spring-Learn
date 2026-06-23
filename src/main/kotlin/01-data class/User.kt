import java.time.LocalDate

data class User(
    val name: String,
    val age: Int,
    val dob: LocalDate,
    val gender: String,
    val address: String,
    val city: String
)

fun main() {

    val user1 = User(
        "Alice",
        28,
        LocalDate.of(2006, 11, 16),
        "male",
        "Phnom Penh",
        "PP"
    )

    val user2 = User(
        "Alex",
        28,
        LocalDate.of(2006, 11, 16),
        "male",
        "Phnom Penh",
        "PP"
    )

    println(user1)
    println(user2)
}