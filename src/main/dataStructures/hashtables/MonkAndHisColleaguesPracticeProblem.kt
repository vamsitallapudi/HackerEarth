package main.dataStructures.hashtables


import java.util.Hashtable


val hashTable: Hashtable<Int, String> = Hashtable()
fun main(args: Array<String>) {
    var iter = readLine()!!.toInt()
    while(iter-- > 0){
        var input = readLine()!!
        var x:List<String> = input.split(" ")
        val rollNo = x[0].toInt()
        val name:String = x[1]
        hashTable[rollNo] = name
    }
    var x = readLine()!!.toInt()
    while (x-- >0) {
        val outputIndex = readLine()!!.toInt()
        println(hashTable[outputIndex])
    }
}