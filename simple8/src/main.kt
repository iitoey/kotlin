package rsk

interface Time {
    fun setTime(hour : Int , min : Int = 0 , secs : Int = 0)
    fun setTime(time : dorkmaiTime)
}

interface EndOfTherWorld {
    fun setTime(time: dorkmaiTime) {

    }
}

class  dorkmaiTime {
    var hour: Int = 0
    var minutes: Int = 0
    var seconds: Int = 0
}

class Yetitime : Time , EndOfTherWorld{

    override fun setTime(time: dorkmaiTime) {
        super.setTime(time)
        super.setTime(time)
    }
    override fun setTime(hour : Int , min : Int , secs : Int) {

    }
}