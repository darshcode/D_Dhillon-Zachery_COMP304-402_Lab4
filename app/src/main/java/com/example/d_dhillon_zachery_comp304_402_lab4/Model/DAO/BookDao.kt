package com.example.d_dhillon_zachery_comp304_402_lab4.Model.DAO

import com.example.d_dhillon_zachery_comp304_402_lab4.Entity.Book
import androidx.lifecycle.LiveData
import androidx.room.*

//this object contains methods for accessing our sql database.
@Dao
interface BookDao {
    @Query("Select * From Books_table")//removed suspend annotation!
    fun getBooks(): LiveData<List<Book>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(book: Book)

    @Update
    suspend fun update(book: Book)         //no assignment

    @Delete()
    suspend fun delete(book: Book)
}