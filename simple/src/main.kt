import com.rsk.Person

fun main(args: Array<String>)
{
    println("Hello, World")

    val dorkmai = Person("dorkmai")



    println("Name is ${dorkmai.name}")

    dorkmai.name = "anne"

    println("Name is ${dorkmai.name}")

    dorkmai.display()
    dorkmai.displayWithLambda(::printName)

}

fun printName(name: String){
    println(name)
}