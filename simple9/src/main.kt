package  rsk
fun main(args: Array<String>){
    val dorkmai = Student("dorkmai", "anne", 1 ,"same")
    println(dorkmai.id)
}
abstract class Person (var firstName: String ,var lastName: String){
    open fun getName(): String = "$firstName $lastName"
    abstract fun getAddress(): String
}

class Student(firstName:String, lastName:String, _id: Int, var tutor:String = "") : Person(firstName , lastName) {
    val id : Int

    init {
        id = _id

    }


    override fun getAddress(): String {
        return ""
    }

    override fun getName(): String {
        return ""
    }
}


