package Model

import Entity.Book
import Model.DAO.BookDao
import androidx.lifecycle.LiveData


// Declares the DAO as a private property in the constructor. Pass in the DAO
// instead of the whole database, because you only need access to the DAO
    class Repository(private val bookDao: BookDao) {

        // Room executes all queries on a separate thread.
        // Observed Flow will notify the observer when the data has changed.
        //val allBooks: LiveData<List<Book>> = bookDao.getBooks()

        // By default Room runs suspend queries off the main thread, therefore, we don't need to
        // implement anything else to ensure we're not doing long running database work
        // off the main thread.

        suspend fun insert(book: Book) {
            bookDao.insert(book)
        }
    }
