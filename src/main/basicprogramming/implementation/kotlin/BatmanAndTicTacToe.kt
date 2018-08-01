package main.basicprogramming.implementation.kotlin

fun main(args: Array<String>) {

    var testCases:Int = readLine()!!.toInt()

    while(testCases-- > 0) {
        val line1 = readLine()!!
        val line2 = readLine()!!
        val line3 = readLine()!!
        val line4 = readLine()!!

        if(ticTacToeLogic(line1,line2,line3,line4)) {
            println("YES")
        } else {
            println("NO")
        }

    }

}

fun ticTacToeLogic(line1:String, line2:String, line3:String, line4:String) :Boolean {
//    TODO: need to change some logic
//    case1: if all the values in a line (any horizontal line) are same
    if(allCharsAreEqual(line1) || allCharsAreEqual(line2) || allCharsAreEqual(line3) || allCharsAreEqual(line4)) {
        return true
    }
//    case2: if any vertical line characters are same
    if(checkIfFourCharsAreEqual(line1[0],line2[0],line3[0],line4[0]) ||checkIfFourCharsAreEqual(line1[1],line2[1],line3[1],line4[1]) ||checkIfFourCharsAreEqual(line1[2],line2[2],line3[2],line4[2]) ||checkIfFourCharsAreEqual(line1[3],line2[3],line3[3],line4[3])) {
        return true
    }
//    case 3: check if diagonals are equal
    if((line1[0]==line2[1] && line1[0]==line3[2] && line1[0]==line4[3]) ||(line1[3]==line2[2] && line1[3]==line3[1] && line1[3]==line4[0])) {
        return true
    }
    return false
}

fun checkIfFourCharsAreEqual(a: Char, b: Char, c: Char, d: Char): Boolean {
    if(a==b && b==c && c==d) {
        return true
    }
    return false
}

fun allCharsAreEqual(str: String): Boolean {
    for(i in 0 until str.length){
        if(str[i]!=str[0]) {
            return false
        }
    }
    return true
}
