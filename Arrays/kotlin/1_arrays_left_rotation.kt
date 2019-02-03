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

// Complete the rotLeft function below.
fun rotLeft(a: Array<Int>, d: Int): Array<Int> {

    // misal 
    // [10,11,12,13,14,15]
    //   0  1  2  3  4  5
    // geser kiri sebanyak 'd = 3'
    // [13,14,15,10,11,12]
    //   3  4  5  0  1  2

    // Paling gampang di split di d, bagian kiri di append ke bagian kanan
    var leftA = a.take(d) // ambil elemen a sebanyak 'd'
    // println(leftA)
    var rightA = a.copyOfRange(d, a.count()) // ambil elemen sisanya, mulai dari 'd' sampai akhir
    // println(rightA.asList())
    return rightA + leftA // gabung

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val a = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = rotLeft(a, d)

    println(result.joinToString(" "))
}
