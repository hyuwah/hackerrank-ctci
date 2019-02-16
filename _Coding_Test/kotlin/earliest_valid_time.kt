/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main(args: Array<String>) {
   
    earliestValidTime(0,0,0,0,0,0)
    earliestValidTime(1,0,2,0,3,0)
    earliestValidTime(4,4,7,8,1,9)
    earliestValidTime(5,1,2,6,6,8,true)
    
    
}

/**
 * EARLIEST VALID TIME
 * a,b,c,d,e,f are element of [0..9]
 */
fun earliestValidTime(a:Int,b:Int,c:Int,d:Int,e:Int,f:Int, debug:Boolean = false){
    var isPossible = true
    var highNumberCount = 0
    var sortedSingularNumber = 0.0
    var swapTemp = 0

    var numsArray = intArrayOf(a,b,c,d,e,f)
    if(debug)println("\t--"+numsArray.joinToString(","))

    // Sort the Array
    numsArray.sort()
    if(debug)println("\t--"+numsArray.joinToString(","))

    numsArray.forEachIndexed{ i, value -> 
        // Count the highnumber (6..9)
        if (value > 5) highNumberCount++

        // Map every element to singular number from left to right
        // e.g [1,2,3,4,5,6] to 123456  
        sortedSingularNumber = sortedSingularNumber + numsArray[i]*Math.pow(10.0,5.0-i)
    }


    // Test of high digit count
    if(debug)println("\t--highNumberCount $highNumberCount")
    if (highNumberCount > 3){
        isPossible = false
        // High number hanya bisa di x[H]:x[m]:x[s]
        // Kalo 4 udah ga akan valid
    }
    // Test with max singularNumber of time
    if(debug)println("\t--sortedSingularNumber $sortedSingularNumber")
    if ( sortedSingularNumber > 235959){
        isPossible = false
    }
    
    
    // Kalo lewat dua test diatas dan Sudah sort ascending
    // Number is possible to be a time, just needs re-arranging
    
    // HH:mm:ss
    // 01:23:45
    // highNumber terkecil di [1]
    // highNumber only possible at [1],[3]
    
    // Swap puluhan detik [4] ke puluhan menit [2] kalo highNumber (6..9)
    if (numsArray[4] > 5){
        swapTemp = numsArray[4];
        numsArray[4] = numsArray[2];
        numsArray[2] = swapTemp;
    }
    
    // Swap puluhan menit [2] ke satuan menit [3] kalo highNumber
    if (numsArray[2] > 5){
        swapTemp = numsArray[2];
        numsArray[2] = numsArray[3];
        numsArray[3] = swapTemp;
    }
    
    // Swap puluhan menit [2] ke satuan jam [1] kalo highNumber
    if (numsArray[2] > 5){
        swapTemp = numsArray[1];
        numsArray[1] = numsArray[2];
        numsArray[2] = swapTemp;
    }
    
    // Swap puluhan menit [2] ke puluhan detik [4] kalo (puluhan menit > puluhan detik)
    if (numsArray[2] > numsArray[4]){
        swapTemp = numsArray[4];
        numsArray[4] = numsArray[2];
        numsArray[2] = swapTemp;
    }

    if(isPossible) println("" + numsArray[0] + numsArray[1] + ":" + numsArray[2] + numsArray[3] + ":" + numsArray[4] + numsArray[5])
    else println("Not possible")
    
    
}