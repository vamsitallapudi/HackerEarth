package main.dataStructures.hashtables

fun main(args: Array<String>) {
    var iter = readLine()!!.toInt()
    while (iter-- > 0) {
        val carSpeed = HashMap<Int, Long>()
        val noOfCars = readLine()!!.toInt()
        val speedOfCars = readLine()!!.split(" ")

        for(i in 0 until noOfCars){
            carSpeed[i] = speedOfCars[i].toLong()
        }

        var count = 0
        for(i in carSpeed){
            for(j in 0..i.key){
                if(i.value > carSpeed[j]!!){
                    break
                }
                if(i.key == j){
                    count += 1
                }
            }
        }
        println(count)
    }
}