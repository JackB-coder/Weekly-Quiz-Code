package com.sample.kotlinquizchallenge

/*
*
* Write a higher-order function that can convert between Celsius and Fahrenheit.
*
* convertTemperature(25.0, celsiusToFahrenheit) //needs to be a higher order function
* convertTemperature(98.6, fahrenheitToCelsius)
*
* // Expected Output
* 25.0 → 77.0
* 98.6 → 37.0
* */
fun convertTemperatureCel(f: Double): Double {

    /// degree C=(\degree F-32)\times 5/9
    //
    return (f-32) * 5 / 9

}

fun convertTemperatureFahr(c: Double): Double{
    //\(F=(C\times 1.8)+32\)
    return (c * 1.8) + 32

}
fun main() {
    val fahr = 98.6
    val celcius = 25.0
    var convertC = 0.0;
    var convertF = 0.0;
    convertF = convertTemperatureFahr(celcius)

    println(convertF)

    convertC = convertTemperatureCel(fahr)
    println(convertC)

}