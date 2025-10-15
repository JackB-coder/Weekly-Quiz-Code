package com.sample.kotlinquizchallenge

/*
*
* Implement an auction bidding system where new bids must be higher than current bid.
*
* // Input
* placeBid(50)  // First bid
* placeBid(30)  // Too low
* placeBid(75)  // Valid higher bid
*
* // Expected Output
* 50 → 50 (accepted)
* 30 → null (rejected)
* 75 → 75 (accepted)
* */

fun main() {

    val bids = listOf<Int>(21 ,43, 121, 87, 3, 90, 11, 121, 122)
    var currentBid = 0

    for( c in bids){
        if( c > currentBid) {
            currentBid = c
            println("$currentBid  ->  + $c +  (accepted)")
        }
        else {
            println("$currentBid  ->  + $c +  (rejected)")
        }
    }

}