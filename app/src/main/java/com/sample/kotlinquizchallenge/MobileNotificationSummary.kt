package com.sample.kotlinquizchallenge

/*
*
* Write a function that takes the number of notifications a user has received and returns a summary string.
*
* Example
* -> 0 -> No Notifications
* -> 3-99 -> You have 3 Notifications
* -> 100+ -> You have Notifications 99+
* */

fun main() {

    val popularity = (0..101).random()

    if(popularity == null){
        println("No Notifications")

    }
    else if(popularity == 100){
        println("You have Notifications 99+")

    }
    else {
        println("$popularity -> you have $popularity Notifications ")

    }

}