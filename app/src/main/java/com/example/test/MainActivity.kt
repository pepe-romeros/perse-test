package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Create an app that takes in as an input from the user two numbers (distinct input fields for each)
 * and when tapping a button, the user is shown on a different screen the product of those two numbers.
 *
 * Ex - Input 2 & 3 - Output 6
 *
 * TODO 1 - Create the screens
 * TODO 2 - Implement user experience (input, output, navigation)
 * TODO 3 - Implement business logic
 * TODO 4 - Create relevant unit test
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}