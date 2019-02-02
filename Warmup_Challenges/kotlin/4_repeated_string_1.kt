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

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {

    if(s == "a") return n // Kalo string cuman "a" berarti sejumlah n

    var totalA = 0L
    var aPerString = s.count{ "a".contains(it) } // itung a di dalam s
    var mult = n/s.length.toLong() // itung ada berapa paket s dalam n (bakal di round down)
    var remainder = n % s.length.toLong() // itung kalo misal n ga habis dibagi s, ada berapa sisa elemen dari s
    
    totalA = (aPerString * mult).toLong() // simple math
    
    // Kalo ada sisaan elemen s
    if(remainder != 0L){
        var remainderA = 0L
        for(i in 0 until remainder.toInt()){
            // traverse s untuk a sampai sejumlah sisaan elemen s
            if(s[i] == 'a') remainderA++
        }
        // tambahin a dari sisa tadi ke a dari paketan s
        totalA += remainderA
    }

    return totalA
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}

/**
NOTES
Int data type can be overflowed by n, so use Long
All test passed
 */