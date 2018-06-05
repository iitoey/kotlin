@file:JvmName("Displayfunctions")

package rsk

fun main (args: Array<String>){
    log(message = "Hello")
}

@JvmOverloads
fun log(message: String, loglevel: Int = 1){
    println(message + loglevel)
}