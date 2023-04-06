package Entity


data class Student(
    var ID :Int ,
    var fName : String,
    var lName : String,
    var password : String,
    var bookID: Book) {

}