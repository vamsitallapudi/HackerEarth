package main.BasicProgramming

//My implementation for Anagrams best solution in Kotlin Programming Language :)
fun main(args: Array<String>) {
    var n = readLine()!!.toInt()
    while (n-- > 0){
        var x = readLine()!!.toCharArray()
        var y = readLine()!!.toCharArray()

        val a = IntArray(26,{_ -> 0})
        val b = IntArray(26,{_ -> 0})

        for(i in x){
            a[i.toInt()-97]++
        }
        for(i in y){
            b[i.toInt()-97]++
        }
        println((0..25).sumBy { Math.abs(a[it]-b[it])})
    }
}
