package main.dataStructures.hashtables

val carSpeed = HashMap<Int, Int>()
fun main(args: Array<String>) {
    var iter = readLine()!!.toInt()
    while (iter-- > 0) {
        val noOfCars = readLine()!!.toInt()
        val speedOfCars = readLine()!!.split(" ")

        for(i in speedOfCars.indices){
            carSpeed[i] = speedOfCars[i].toInt()
        }

        var count = 0
        for(i in carSpeed){
            for(j in 0..i.key){
                if(i.value > carSpeed[j]!!){
                    break
                }
                count++
            }
        }
        println(count)
    }
}