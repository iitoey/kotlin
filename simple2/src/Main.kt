fun main (args: Array<String>){
    println("Hello , World" )
    val q:Question = Question()


    q.Answer = "50"

    q.display()

    println("The answer is ${q.Question} is ${q.Answer}")

    val message = if (q.Answer == q.CorrectAnswer) {
        "You were Correct"
    } else {
        "try again"
    }

    println(message)

    q.printResult()

    val number : Int? = try {
        Integer.parseInt(q.Answer)
    } catch (e:NumberFormatException){
        null
    }

    println("Number is $number")
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