package `05-enum`

enum class Direction {

    NORTH,
    EAST,
    SOUTH,
    WEST,


}

fun main() {

    var dir = Direction.EAST
    var dir2 = Direction.SOUTH
    var dir3 = Direction.WEST
    var dir4 = Direction.NORTH

    println("first direction go to --> ${dir}")
    println("second direction go to --> ${dir2}")
    println("third direction go to --> ${dir3}")
    println("fourth direction go to --> ${dir4}")

}