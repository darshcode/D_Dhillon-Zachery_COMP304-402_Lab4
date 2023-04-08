package com.example.d_dhillon_zachery_comp304_402_lab4.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Books_table")
class Book(
    @PrimaryKey(autoGenerate = true) val ISBN: Int,
    @ColumnInfo(name = "Name") val bookName: String,
    @ColumnInfo(name = "AuthorName") val authorName: String,
    @ColumnInfo(name = "Genre") val genere: String,
    @ColumnInfo(name = "description") val description: String
)
