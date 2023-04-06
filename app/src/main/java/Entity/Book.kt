package Entity

@Entity(tableName = "Books")
data class Book (
    @PrimaryKey var bookName: String,
    @ColumnInfo(name = author)var authorName: String,
            var description: String){


}
