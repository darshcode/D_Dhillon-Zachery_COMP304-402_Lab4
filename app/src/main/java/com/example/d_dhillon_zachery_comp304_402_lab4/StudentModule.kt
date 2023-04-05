package com.example.d_dhillon_zachery_comp304_402_lab4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class StudentModule : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_module)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.bookcategory, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.horror_category -> {
                // Handle menu item 1 click
                true
            }
            R.id.action_category -> {
                // Handle menu item 2 click
                true
            }
            R.id.romance_category -> {
                // Handle menu item 3 click
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}