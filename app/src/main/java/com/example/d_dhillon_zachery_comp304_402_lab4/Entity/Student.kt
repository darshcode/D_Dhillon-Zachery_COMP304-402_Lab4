package com.example.d_dhillon_zachery_comp304_402_lab4.Entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Students")
class Student(
    @PrimaryKey(autoGenerate = true) val ID: Int,
    @ColumnInfo(name = "First Name") val fName: String,
    @ColumnInfo(name = "Last Name") val lName: String,
    @ColumnInfo(name = "Password") var password: String,
    //@ColumnInfo(name = "Rented Books") var rentedBooks :List<Book>
    ) {
//code goes here
}