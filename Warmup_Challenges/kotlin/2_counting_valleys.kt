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

// Complete the countingValleys function below.
fun countingValleys(n: Int, s: String): Int {
    var valley = 0
    var Y = 0
    var lastY = 0
    for(c in s){
        lastY = Y
        // Update Y, Mountain means positive, Valley means negative
       if(c == 'U') Y += 1 else Y -= 1
       // 1 Valley itu ketika Y negatif balik ke 0
       // Seberapapun dalamnya, sevariatif apapun bentukan valleynya
       if(lastY < 0 && Y == 0) valley += 1
    }
    return valley
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = countingValleys(n, s)

    println(result)
}
