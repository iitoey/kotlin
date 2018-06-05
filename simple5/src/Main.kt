package rsk

fun main(args: Array<String>){
    val text = "With multiple \t whitespace"
    println (replaceMultiple(text))
    println(text.replaceMultipleEX())
}

fun replaceMultiple(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, "")
}

fun String.replaceMultipleEX() : String {
    var regex = Regex("\\s+")
    return regex.replace(this, "")
}