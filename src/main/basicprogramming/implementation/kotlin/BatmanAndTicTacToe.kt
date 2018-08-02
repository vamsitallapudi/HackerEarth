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

fun ticTacToeLogic(line1:String, line2:String, line3:String, line4:String) : Boolean {
//    TODO: need to change some logic in case of expected next move

//    case -1 row check:
    if(performRowCheck(line1) || performRowCheck(line2)  || performRowCheck(line3) || performRowCheck(line4)) return true

//    case -2 column check
    if(performColumnCheck(line1,line2,line3,line4)) return true

//    case -3 diagonal check
    if(performDiagonalCheck(line1, line2, line3, line4)) return true
    return false
}

fun performDiagonalCheck(line1: String, line2: String, line3: String, line4: String): Boolean {

    val diagonalString1 = (line1[0].toString() + line2[1] + line3[2] + line4[3])
    val diagonalString2 = (line1[3].toString() + line2[2] + line3[1] + line4[0])

    if(diagonalString1.contains("xx.") || diagonalString1.contains(".xx") || diagonalString1.contains("x.x")) return true
    if(diagonalString2.contains("xx.") || diagonalString2.contains(".xx") || diagonalString2.contains("x.x")) return true

//    small diagonals with 3 ends
    val diagonalString3 = (line1[1].toString() + line2[2] + line3[3])
    val diagonalString4 = (line1[2].toString() + line2[1] + line3[0])
    val diagonalString5 = (line2[0].toString() + line3[1] + line4[2])
    val diagonalString6 = (line2[2].toString() + line3[1] + line4[0])
    val diagonalString7 = (line2[3].toString() + line3[2] + line4[1])

    if(diagonalString3.contains("xx.") || diagonalString3.contains(".xx") || diagonalString3.contains("x.x")) return true
    if(diagonalString4.contains("xx.") || diagonalString4.contains(".xx") || diagonalString4.contains("x.x")) return true
    if(diagonalString5.contains("xx.") || diagonalString5.contains(".xx") || diagonalString5.contains("x.x")) return true
    if(diagonalString6.contains("xx.") || diagonalString6.contains(".xx") || diagonalString6.contains("x.x")) return true
    if(diagonalString7.contains("xx.") || diagonalString7.contains(".xx") || diagonalString7.contains("x.x")) return true

    return false
}

fun performColumnCheck(line1: String, line2: String, line3: String, line4: String): Boolean {
    for(i in 0..3) {
        val columnString = (line1[i].toString()+line2[i]+line3[i]+line4[i])
        if(columnString.contains("xx.") ||columnString.contains("x.x") || columnString.contains(".xx")) {
            return true
        }
    }
    return false
}

fun performRowCheck(line: String) :Boolean{
    if(line.contains("xx.") || line.contains(".xx") || line.contains("x.x")){
        return true
    }
    return false
}
