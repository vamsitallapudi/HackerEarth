package main.basicprogramming.implementation.kotlin

fun main(args: Array<String>) {
    val input = readLine()!!

    val goodLuck = fortuneCounter(input)
    if(goodLuck) println("Good luck!") else println("Sorry, sorry!")
}

private fun fortuneCounter(input: String) : Boolean{
    var consecutiveCount = 0

    for (i in 1 until input.length) {
        if (input[i] == input[i - 1]) {
            consecutiveCount += 1
            if (consecutiveCount >= 6) {
                return true
            }
        } else if (consecutiveCount < 6) {
            consecutiveCount = 0
        }

    }
    return false
}