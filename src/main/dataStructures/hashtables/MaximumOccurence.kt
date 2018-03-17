package main.dataStructures.hashtables

import java.util.*

var hashMap: HashMap<Int,Int> = HashMap(94)
fun main(args: Array<String>) {
    val input = readLine()!!

    for(i in 0..94){
        hashMap[i] = 0
    }

    for(i in input){
        hashMap[i-' '] = hashMap[i-' ']!!+1
    }

    var largeKey = 0
    for(i in hashMap.keys){
        if(hashMap[i]!!>hashMap[largeKey]!!){
            largeKey = i
        }
    }
    println("${(largeKey +' '.toInt()).toChar()} ${hashMap[largeKey]}")
}
