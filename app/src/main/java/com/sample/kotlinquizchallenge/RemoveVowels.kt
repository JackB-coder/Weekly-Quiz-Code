package com.sample.kotlinquizchallenge

/*
*
* Write a function that removes all vowels from a string, case-insensitive.
*
* // Input
* removeVowels("Hello World")
* removeVowels("Kotlin Programming")
*
* // Expected Output
* "Hello World" → "Hll Wrld"
* "Kotlin Programming" → "Ktln Prgrmmng"
* */

fun main() {
    val word01: String = "Hello World"
    val word02: String = "Kotlin Programming"
    val newWord01 = mutableListOf<Char>()
    val newWord02 = mutableListOf<Char>()
    /*
    cycle each word and remove it

    break word and see if it equals word is in
     */
    for(c in word01){
        if(c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u'){
        // do nothing
        }
        else{
            newWord01.add(c)
        }
    }
    for(c in word02){
        if(c == 'a' || c == 'e' || c =='i' || c == 'o' || c == 'u'){
            // do nothing
        }
        else{
            newWord02.add(c)
        }
    }

    print(newWord01.joinToString(""))
    print(newWord02.joinToString(""))




}