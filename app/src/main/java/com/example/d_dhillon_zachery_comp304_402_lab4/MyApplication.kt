package com.example.d_dhillon_zachery_comp304_402_lab4

import android.app.Application
import com.example.d_dhillon_zachery_comp304_402_lab4.Model.DB.MyDataBase
import com.example.d_dhillon_zachery_comp304_402_lab4.Model.Repository

class MyApplication : Application() {
        // Using by lazy so the database and the repository are only created when they're needed
        // rather than when the application starts
        val database by lazy { MyDataBase.getDatabase(this) }
        val repository by lazy { Repository(database.bookDao()) }

        //Uncomment if you want to populate your DB (Do it in RoomDB file as well)
//    override fun onCreate() {
//        super.onCreate()
//        CoroutineScope(Dispatchers.IO).launch {
//            database.addSomeDummyData()
//        }
//    }
}