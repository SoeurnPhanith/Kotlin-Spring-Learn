package `03-encapsulation`

class Student {

    private var _score: Int = 0

    //set value to score
    var score : Int = 0
        set(value){
            if(!(value in 0..100)){
                println("Score must be between 0 and 100")
                return;
            }
            println("Set score : $value")
            _score = value
        }

    //get score to validate logic
    val grade: String
        get() {
            return when (_score) {
                in 80..100 -> "A"
                in 70..79 -> "B"
                in 60..69 -> "C"
                in 50..59 -> "D"
                else -> "F"
            }
        }

    fun showResults(){
        println("Score = $_score")
        println("Grade = $grade")
    }

}

fun main(){

    val s = Student();

    s.score = 90
    s.showResults()


}