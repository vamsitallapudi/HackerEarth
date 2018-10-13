package main.dataStructures.sorting

fun main(args: Array<String>) {
    val numToSort = ArrayList(readLine()!!.split(" ").map { it.toInt() }) // -> to read the input from console and to convert it to arraylist of integers
    var cursorPlace = 0 // -> to store minimum value's place while iterating across the list values
    var toBeSorted  = 0 // -> to navigate only through unsorted values after each iteration

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
