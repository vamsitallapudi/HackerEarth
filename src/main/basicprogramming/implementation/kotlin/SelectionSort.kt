package main.basicprogramming.implementation.kotlin

fun main(args: Array<String>) {
    val numToSort = ArrayList(readLine()!!.split(" ").map { it.toInt() })
    var cursorPlace = 0
    var toBeSorted  = 0

    while(toBeSorted < numToSort.size){
        for(i in toBeSorted until numToSort.size) {
            if(numToSort[i]< numToSort[cursorPlace]) {
                cursorPlace = i
            }
        }
        swap(numToSort,cursorPlace, toBeSorted)
        toBeSorted++
        cursorPlace=toBeSorted
    }
    for (i in numToSort) {
        println(i)
    }
}
fun swap(a : ArrayList<Int>, b: Int, c:Int) {
    val temp = a[b]
    a[b] = a[c]
    a[c] = temp
}

