package main.data_structures.hash_tables


var frequency= Array(26,{0})
fun main(args: Array<String>) {
    countFreq(readLine()!!)
}

fun hashFunc(c:Char): Int{
    return  c-'a'
}

fun countFreq(s:String){

    for(a in s) {
        var index:Int = hashFunc(a)
        frequency[index]++
    }
    for(i in 0..25){

        println("${i.toChar() + 'a'.toInt()} ${frequency[i]}")
    }
}

