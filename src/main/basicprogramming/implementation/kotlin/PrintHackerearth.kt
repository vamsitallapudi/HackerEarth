package main.basicprogramming.implementation.kotlin

fun main(args: Array<String>) {

    val length = readLine()!!.toInt()
    val input = readLine()!!
    println(compareWithHEString(input).toString())
}

fun compareWithHEString(str:String) :Int{

//  hackerearth characters - 2 a's, 1 c, 2 e's, 2 h's, 1 k, 2 r's, 1 t

    val countOfA:Int = str.count{it == 'a'}
    val countOfC:Int = str.count{it == 'c'}
    val countOfE:Int = str.count{it == 'e'}
    val countOfH:Int = str.count{it == 'h'}
    val countOfK:Int = str.count{it == 'k'}
    val countOfR:Int = str.count{it == 'r'}
    val countOfT:Int = str.count{it == 't'}

    val ace = minOf(countOfA/2,countOfC, countOfE/2)
    val hkr = minOf(countOfH/2, countOfK, countOfR/2)

    return minOf(ace, hkr, countOfT)
}