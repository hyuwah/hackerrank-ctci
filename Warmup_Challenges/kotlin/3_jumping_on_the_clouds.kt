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

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>): Int {
    var minJumps = 0
    var i = 0 // Index buat traverse array
    while(i < c.count()-1){
        // Avoid out of bounds

        // Possible buat loncat jauh
        if(i < c.count()-2){
            if(c[i] == 0 && c[i+2] == 0){
                // [0]  0   0
                minJumps += 1
                i += 2
                //  0   0  [0]
            }else if(c[i] == 0 && c[i+1] == 1 && c[i+2] == 0){
                // [0]  1   0
                minJumps += 1
                i += 2
                //  0   1  [0]
            }else if(c[i] == 0 && c[i+1] == 0){
                // [0]  0   1
                minJumps += 1
                i += 1
                //  0  [0]  1    
            }
        }
        // Udah hampir di ujung array, loncat pendek only
        else if(i<c.count()){
            if(c[i] == 0 && c[i+1] == 0){
                // [0]  0  (END)
                minJumps += 1
                i += 1
                //  0  [0] (END)
            }
        }
    }

    return minJumps

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}
