package Model.DAO

import Entity.Book
import androidx.lifecycle.LiveData
import androidx.room.*

//this object contains methods for accessing our sql database.
@Dao
interface BookDao {
    @Query("Select * From Books Order By Book")//needs fixing
    suspend fun getBooks(): LiveData<List<Book>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(book: Book)

    @Query("Delete From Books")
    suspend fun deleteAll()         //no assignment

    @Delete()
    suspend fun delete(book: Book)
}