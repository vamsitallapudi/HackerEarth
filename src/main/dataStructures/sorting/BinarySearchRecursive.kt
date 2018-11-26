package main.dataStructures.sorting

fun main(args: Array<String>) {
    val input = readLine()!!.trim().split(" ").map { it -> it.toInt() }.toIntArray()
    val eleToSearch = readLine()!!.trim().toInt()
    val pos = binarySearchRecursive(input, eleToSearch, 0, input.size -1)
    if(pos >= 0 ) {
        println(pos)
    } else {
        println("Position not found")
    }
}

fun binarySearchRecursive(input: IntArray, eleToSearch: Int, low:Int, high:Int): Int {

    while(low <=high) {
      val mid = (low + high) /2
        when {
            eleToSearch > input[mid] -> return binarySearchRecursive(input, eleToSearch, mid+1, high)
            eleToSearch < input[mid] -> return binarySearchRecursive(input, eleToSearch, low, mid-1)
            eleToSearch == input[mid] -> return mid
        }
    }
    return -1
}
