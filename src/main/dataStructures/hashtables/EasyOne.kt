package main.dataStructures.hashtables

fun main(args: Array<String>) {
    try {

        var iter = readLine()!!.toInt()
        while (iter-- > 0) {
            val details = readLine()!!.split(" ")
            val n = details[0].toInt()
            var q = details[1].toInt()
            val valuesLine = readLine()!!.split(" ")
            val valuesMap: HashMap<Int, Int> = HashMap()

            for (i in 0 until n) {
                if (valuesMap[valuesLine[i].toInt()] == null) {
                    valuesMap[valuesLine[i].toInt()] = 0
                }
                valuesMap[valuesLine[i].toInt()] = valuesMap[valuesLine[i].toInt()]!! + 1
            }
            while (q-- > 0) {
                val num = readLine()!!.toInt()
                if (valuesMap[num] == null) {
                    valuesMap[num] = 0
                }
                println(valuesMap[num])
            }
        }
    } catch (e: Exception) {
        return
    }
}