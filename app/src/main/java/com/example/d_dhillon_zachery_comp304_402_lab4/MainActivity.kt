package com.example.d_dhillon_zachery_comp304_402_lab4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.viewModels
import com.example.d_dhillon_zachery_comp304_402_lab4.ViewModel.MyViewModel
import com.example.d_dhillon_zachery_comp304_402_lab4.ViewModel.MyViewModelFactory

class MainActivity : AppCompatActivity() {

    //connection to view model
    private val myViewModel: MyViewModel by viewModels {
        MyViewModelFactory((application as MyApplication).repository)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val signUpPageButton: Button = findViewById(R.id.signUpPageButton)

        signUpPageButton.setOnClickListener{
            val intent = Intent(this, StudentSignUpActivity::class.java)
            startActivity(intent)
        }
    }
}