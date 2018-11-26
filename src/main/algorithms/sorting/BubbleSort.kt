package main.algorithms.sorting

fun main(args: Array<String>) {
    var numSwaps = 0
    var isSorted = false
    val str = readLine()!!
    val intList: ArrayList<Int> = ArrayList(str.split(" ").map { it.toInt() }) //1) read values and convert them to arraylist

    var lastUnsorted = intList.size - 1 // 2) to keep the track of unsorted array

    while (!isSorted) {
        isSorted = true
        for (i in 0 until lastUnsorted) {
            if (intList[i] > intList[i + 1]) {
                swapValues(intList, i, i + 1)
                numSwaps++
                isSorted = false // 3) making this as false whenever the swap needs to be performed.
            }
        }
        lastUnsorted--// 4) decreasing the count since one more element from right side is placed in sorted position
    }
    for(i in intList) {
        println(i)
    }
}

fun swapValues(list: ArrayList<Int>, a: Int, b: Int) {
    val temp = list[b]
    list[b] = list[a]
    list[a] = temp
}