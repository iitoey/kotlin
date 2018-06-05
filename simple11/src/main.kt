package  rsk
fun main (args : Array<String>) {
    var dm = Student(1, "dorkmai")
    var km = Student(1, "dorkmai")

    println(dm)

    if (dm == km) {
        println(" = ")
    } else {
        println(" != ")
    }

    var newDm = dm.copy(name = "anne")
    println(newDm)
}
    class Student(val id : Int ,val name : String) {


    }
