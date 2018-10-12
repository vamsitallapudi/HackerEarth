package main.basicprogramming.implementation.kotlin


fun main(args: Array<String>) {
    var numSwaps = 0
    var count = readLine()!!.toInt()
    var isSorted = false
    val str = readLine()!!
    val intList: ArrayList<Int> = ArrayList(str.split(" ").map { it.toInt() })

    var lastUnsorted = intList.size - 1

    while (!isSorted) {
        isSorted = true
        for (i in 0 until lastUnsorted) {
            if (intList[i] > intList[i + 1]) {
                swapNum(intList, i, i + 1)
                numSwaps++
                isSorted = false
            }
        }
        lastUnsorted--
    }
    println("Array is sorted in $numSwaps swaps.")
    println("First Element: ${intList[0]}")
    println("Last Element: ${intList[intList.size - 1]}")
}

fun swapNum(list: ArrayList<Int>, a: Int, b: Int) {
    val temp = list[b]
    list[b] = list[a]
    list[a] = temp
}