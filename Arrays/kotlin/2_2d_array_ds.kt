import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the hourglassSum function below.
fun hourglassSum(arr: Array<Array<Int>>): Int {

    var sumArr = listOf(0) // Bikin list penampung sum
    sumArr -= listOf(0) // biar empty dulu
    //println(sumArr)
    
    for(y in 0..3){
        for(x in 0..3){
            // Hitung sum dari bentukan hourglass
            var hourglassSum = arr[y][x] + arr[y][x+1] + arr[y][x+2] + arr[y+1][x+1] + arr[y+2][x] + arr[y+2][x+1] + arr[y+2][x+2]
            sumArr += listOf(hourglassSum) // add ke list
            //println(hourglassSum)
        }
    }
    
    //println(sumArr)
    //println(sumArr.max())

    return sumArr.max() as Int // return sum maksimum
    // '.max()' defaultnya 'Int?' jadi di cast ke Int

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}
