package com.example.d_dhillon_zachery_comp304_402_lab4.Model.DB

import com.example.d_dhillon_zachery_comp304_402_lab4.Entity.Book
import com.example.d_dhillon_zachery_comp304_402_lab4.Entity.Librarian
import com.example.d_dhillon_zachery_comp304_402_lab4.Entity.Student
import com.example.d_dhillon_zachery_comp304_402_lab4.Model.DAO.BookDao
import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


// Annotates class to be a Room Database with a table (entity) of the Word class
    @Database(entities = [Book::class, Librarian::class, Student::class], version = 1, exportSchema = false)
    public abstract class MyDataBase : RoomDatabase() {

        abstract fun bookDao(): BookDao

        companion object {
            // Singleton prevents multiple instances of database opening at the
            // same time.
            @Volatile
            private var INSTANCE: MyDataBase? = null

            fun getDatabase(context: Context): MyDataBase {
                // if the INSTANCE is not null, then return it,
                // if it is, then create the database
                return INSTANCE ?: synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        MyDataBase::class.java,
                        "my_database"
                    ).build()
                    INSTANCE = instance
                    // return instance
                    instance
                }
            }
        }
    }
