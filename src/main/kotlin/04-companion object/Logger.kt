
class Logger {

    companion object{
        fun log(msg: String){
            println("show logging : $msg")
        }
    }

}

fun main() {

    Logger.log("working")

}