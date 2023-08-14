package com.example.neuerprojekt140823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.neuerprojekt140823.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    val inputString = "Hallo Welt"
    val nummer = 3

    val encodedString = enCodeString(inputString, nummer)

    Log.d("MainActivity","Encoded String: $encodedString")

}

    fun enCodeString(buchstabe: String, nummer: Int):String {
        val buchstaben = mutableListOf<Char>()

        for (char in buchstabe){
            if(char.isLetter()){
                val baseChar = if(char.isUpperCase()) 'A' else 'a'
                val shiftedChar = ((char.toInt() - baseChar.toInt() + nummer) % 26 + baseChar.toInt()).toChar()
                buchstaben.add(shiftedChar)
            } else {
                buchstaben.add(char)
            }
        }

        return buchstaben.joinToString("")
    }




}
