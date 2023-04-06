package Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Books")
class Book(
    @PrimaryKey(autoGenerate = true) val ISBN: Int,
    @ColumnInfo(name = "Name") val bookName: String,
    @ColumnInfo(name = "authorName") val authorName: String,
    @ColumnInfo(name = "Genere") val genere: String,
    @ColumnInfo(name = "description") val description: String
) {
    //code goes here.
}
