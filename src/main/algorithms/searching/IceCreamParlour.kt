package main.algorithms.searching

import java.util.*
import kotlin.collections.*
import kotlin.ranges.*
import kotlin.text.*

// Complete the whatFlavors function below.
fun whatFlavors(menu: Array<Int>, money: Int): Array<Int>? {

    val sortedMenu = menu.clone()

    Arrays.sort(sortedMenu)

    for ( i in 0 until sortedMenu.size) {
        val compliment = money - sortedMenu[i]
        val location = Arrays.binarySearch(sortedMenu, i+1, sortedMenu.size, compliment)

        if(location >=0 && location < sortedMenu.size && sortedMenu[location] == compliment) {
            return getIndicesFromValue(menu, sortedMenu[i], compliment)
        }
    }
    return null
}

fun getIndicesFromValue(menu: Array<Int>, value1: Int, value2: Int): Array<Int> {
    val index1 = indexOf(menu,value1, -1)
    val index2 = indexOf(menu,value2,index1)
    val indices:Array<Int> = Array(2){0}
    indices[0] = Math.min(index1,index2)
    indices[1] = Math.max(index1,index2)
    return indices
}

fun indexOf(array:Array<Int>, value:Int, excludeIndex:Int) :Int{
    for( i in 0 until array.size) {
        if(array[i] == value && i != excludeIndex) {
            return i
        }
    }
    return -1
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val money = scan.nextLine().trim().toInt()

        val n = scan.nextLine().trim().toInt()

        val cost = scan.nextLine().trim().split(" ").map{ it.trim().toInt() }.toTypedArray()

        (whatFlavors(cost,money)?.map { print("${it+1} ") })
        println()
    }
}
