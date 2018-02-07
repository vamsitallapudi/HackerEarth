package main.BasicProgramming

fun main(args: Array<String>) {
    val testCases = readLine()!!.toInt()
    for (i in 1..testCases) {
        val s1 = readLine()!!
        val s2 = readLine()!!
        val hashMap1 = HashMap<Char, Int>()
        val hashMap2 = HashMap<Char, Int>()
        for (c in s1) {
            if (hashMap1[c] == null)
                hashMap1[c] = 1
            else
                hashMap1[c] = hashMap1[c]!! + 1
        }
        for (c in s2) {
            if (hashMap2[c] == null)
                hashMap2[c] = 1
            else
                hashMap2[c] = hashMap2[c]!! + 1
        }
        var result = 0
        hashMap1.forEach { entry ->
            result += Math.abs(hashMap2.getOrDefault(entry.key, 0) - entry.value)
        }
        hashMap2.forEach { entry ->
            result += if (hashMap1.containsKey(entry.key)) 0 else entry.value
        }
        println(result)
    }
}