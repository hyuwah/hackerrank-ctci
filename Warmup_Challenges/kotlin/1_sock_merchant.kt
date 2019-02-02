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

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var pairs = 0
    var colors = mutableListOf<Int>()
    // println(ar.toString()) // VERBOSE
    // Iterate Array
    for (i in ar){
        // i as current color
        // create second array of UNIQUE color i
        if(!colors.contains(i)) {
            colors.add(i) // Add the color i
            // Iterate again to count the current color
            var count = 0
            for(j in ar){
                // count i == j
                if(i == j) count += 1
            }
            // println("count $count") // VERBOSE
            // divide by 2, add to pair 
            // # (int) / 2 (int) should always result pair number
            pairs += count / 2
        }
        // skip it if the current color i already counted
    }
    // println(colors.toString()) // VERBOSE
    return pairs


}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
