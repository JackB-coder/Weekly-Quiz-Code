package com.sample.kotlinquizchallenge

/*
* Find the longest sequence of consecutive zeros in binary representation surrounded by ones.
*
* // Input
* findBinaryGap(9)   // Binary: 1001
* findBinaryGap(529) // Binary: 1000010001
* findBinaryGap(32)  // Binary: 100000
*
* // Expected Output
* 9 → 2
* 529 → 4
* 32 → 0 (no gap surrounded by ones)
* */

fun findBinaryGap(number: Int): String{
    val binary = Integer.toBinaryString(number)
    return binary

}

fun main() {
    val number = (1..100).random();
    val answer = findBinaryGap(number)

    print("$number → $answer")




}