package com.example.d_dhillon_zachery_comp304_402_lab4.Model

import com.example.d_dhillon_zachery_comp304_402_lab4.Entity.Book
import com.example.d_dhillon_zachery_comp304_402_lab4.Model.DAO.BookDao
import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData


// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
    class Repository(private val bookDao: BookDao) {

        // Room executes all queries on a separate thread.
        // Observed Flow will notify the observer when the data has changed.
        val allBooks: LiveData<List<Book>> = bookDao.getBooks()

        // By default Room runs suspend queries off the main thread, therefore, we don't need to
        // implement anything else to ensure we're not doing long running database work
        // off the main thread.

        suspend fun insert(book: Book) {
            bookDao.insert(book)
        }
    }
