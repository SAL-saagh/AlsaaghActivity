package com.example.alsaaghactivity

import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun main(){
        val a = 1 // #1 Declare an immutable variable a and initialize it with a value. Compiler should be able to infer it to be of type Int
        val weight : Float = 10.1f // #2 Explicitly declare an immutable float variable weight and initalize it with any value
        val i = "lbs" // #3 Declare an immutable variable which will be assigned the value "lbs"
        var patient : String? = null // #4 Declare a variable patient without initialization.
        patient = "Alsaagh, sam" // #5 Assign your name to variable patient
        var age = 25 // #6 Declare a variable age.
        var j = 0x730d06 // #7 Declare a mutable variable which will be initialized to 0x730d06
        var aVAR : Short = 2767 // #8 Explicitly declare a variable aVAR that will only hold 16 bit of data
    }
}