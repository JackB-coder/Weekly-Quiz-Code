package com.sample.kotlinquizchallenge

/*
* Find the most frequently occurring word, ignoring common stop words.
*
* // Input
* findMostCommonWord("The sun shines and the sky is blue and clear")
*
* // Expected Output
* "The sun shines and the sky is blue and clear" → "and"
*
* */

fun findMostCommonWord(words: String): Map.Entry<String, Int>? {
    var current = mutableListOf<Char>()
    val word = mutableListOf<String>()
    //list
    //compare
    for(c in words){

        if( c != ' '){
            current.add(c)
        }
        else{
            if(current.isNotEmpty()) {
                word.add(current.joinToString(""))
                current.clear()
            }
        }
    }
    if (current.isNotEmpty()) {
        word.add(current.joinToString(""))
    }
    val freq = word.groupingBy { it }.eachCount()
    val mostCommon = freq.maxByOrNull { it.value }
    return mostCommon

}

fun main() {

    val word01 = " The sun shines and the sky is blue and clear "
    val answer = findMostCommonWord(word01)

    print(answer)

}