package com.myapplicationdev.android.demokotlinbasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            val userDob= etDOB.text.toString()
            if(userDob.isNotEmpty()) {
                val year = Calendar.getInstance().get(Calendar.YEAR)
                var output = ""
                val age = year - userDob.toInt()
                tvShowAge.text = "Your age is $age"
                if(age <18) {
                    output = "Young People"
                }else if(age in 18..65){
                    output = "Middle-aged"

                }else if(age in 80..99){
                    output = "Elderly"
                }else{
                    output = "Long-lived elderly"
                }
                tvSHowAgeGrp.text = "$output"

            }else{
                Toast.makeText(this,"Please enter your birth year ",Toast.LENGTH_SHORT).show()
            }

        }
    }
}