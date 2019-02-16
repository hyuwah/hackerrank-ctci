/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun main(args: Array<String>) {
   
    binaryGap(1041)
    binaryGap(1024)
    binaryGap(328)
    binaryGap(1376796946)

}

fun binaryGap(N: Int): Int {
    // write your code in Kotlin
    var longestGap = 0
    var currentGap = 0
    var startCount = false
    var countingGap = false
    var binaryString = N.toString(2)
    binaryString.forEach { value -> 
        if(value=='1'){
            if(!startCount) startCount = true
            else if(startCount && countingGap){
                if(currentGap > longestGap) longestGap = currentGap
                currentGap = 0
                countingGap = false
            }
        }else{
            if(startCount){
                currentGap += 1
                countingGap = true
            }
        }
    }
    
    return longestGap
}