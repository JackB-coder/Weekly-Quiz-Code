package com.sample.kotlinquizchallenge

/*
*
* Create a function that calculates movie ticket price based on age and showtime.
*
* // Input
* calculateTicketPrice(age = 25, isMatinee = false) // Adult, evening
* calculateTicketPrice(age = 70, isMatinee = true)  // Senior, matinee
* calculateTicketPrice(age = 8, isMatinee = false)  // Child, evening
*
* // Expected Output
* 25, false → 15
* 70, true → 8
* 8, false → 8
*
* */
fun calculateTicketPrice(age: Int, isMatinee: Boolean): Int {
    /*
    val kids = 11
    val oldPeople = 65
     */
    var ticketPrice = 15;
    if(age <= 11 || age >= 65){
        ticketPrice = 8
        return ticketPrice
    }

    return ticketPrice

}
fun main() {

    val customers = listOf(
        Pair(25, true),
        Pair( 70, true),
        Pair(8, false)
    )
    for (customer in customers) {
        val ticketPrice = calculateTicketPrice(customer.first, customer.second)
        println(ticketPrice)
    }

}