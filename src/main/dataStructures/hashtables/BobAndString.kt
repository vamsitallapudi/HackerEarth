package main.dataStructures.hashtables

import kotlin.collections.HashMap

var sortTableT = HashMap<Int, Int>(26)
var sortTableS = HashMap<Int, Int>(26)
fun main(args: Array<String>) {
    var iter = readLine()!!.toInt()
    var count =0
    while(iter-- > 0) {
        var T = readLine()!!
        var S = readLine()!!

        for(i in 0..25) {
            sortTableT[i] = 0
            sortTableS[i] = 0
        }


        for(i in T){
            sortTableT[i-'a'] = sortTableT[i-'a']!!+1
        }
        for(i in S){
            sortTableS[i-'a'] = sortTableS[i-'a']!!+1
        }
        for(i in 0..25){
            count+=Math.abs(sortTableT[i]!! - sortTableS[i]!!)
        }
        println(count)
    }
}