package objects_tests

fun main(){

    val readerJohn = Reader("John Snow",123456,"Winter fresh","23/02/1969",7458686)
    val readerMike = Reader("Mike Tyson",234556,"Box and Casino","30/06/1966",7458695)

    val dictionaryBook = Book("V.V.Dal","Explanatory Dictionary")
    val adventureBook = Book("R.L. Stivenson","Treasure Island")
    val barmaleyBook = Book("K.I. Chukovskiy","Barmaley")

    readerJohn.takeBook(5)
    readerJohn.returnBook(2)

}

class Reader(
    val fullName:String,
    val memNumber:Int,
    val facultyName:String,
    val birthDate:String,
    val memTel:Int){

    fun takeBook(bookNum:Byte){
        println("$fullName took $bookNum books.")
    }

    fun returnBook(bookNum:Byte){
        println("$fullName return $bookNum books.")
    }

}
class Book(val authorName:String, val bookName:String){

}