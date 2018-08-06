package main.algorithms.greedyAlgorithms

fun main(args: Array<String>) {
    var input = readLine()!!.toInt()

    while (input-- > 0) {
        val str = readLine()!!
        var strArray = str.toCharArray().toMutableList()
        performRecursion(strArray)
        println(String(strArray.toCharArray()))
    }
}

fun performRecursion(strArray: MutableList<Char>) {
    for (i in 1 until strArray.size) {
        if (i < strArray.size && strArray[i] == strArray[i - 1]) {
            strArray.removeAt(i)
            return performRecursion(strArray)
        }
    }
}