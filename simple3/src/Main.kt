import java.io.FileReader
import java.io.IOException
import java.util.*

fun main (args: Array<String>) {
        var reader = FileReader("filename")
    try {
        reader.read()
    } catch (e: IOException){

    } finally {

    }


}
fun ranges() {
    for(i in 1..10){
        println(i)
    }


    var numbers = listOf(1, 2, 3, 4, 5)

    for (i in numbers) {
        println(i)
    }


    var ages = TreeMap<String, Int>()
    ages["Kevin"] = 55
    ages["dorkmai"] = 22
    ages["anne"] = 21
    ages["momo"] = 1

    for ((name, age) in ages) {
        println("$name is $age")
    }

    for ((index ,element) in numbers.withIndex()){
        println("$element at $index")
    }

    var range = 'a'..'z'
    println(range)

}
class Question {
    var Answer:String? = null
    val CorrectAnswer = "42"
    val Question : String = "What is nember?"

    fun display() {
        println("you said $Answer")
    }

    fun printResult() {
        when (Answer) {
            CorrectAnswer -> print("You were Correct")
            else -> print("try again")
        }
    }
}