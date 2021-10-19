package objects_tests

fun main(){
    val ivanov = Aspirant("Ivan","Ivanov","fin123",4.8)
    val smirnov = Student("Smirnov","Petr","meh456",5.0)

    val students = listOf(ivanov,smirnov)

    students.forEach(){it.getScholarship()}
    students.forEach(){ println(it.scholarship)}

}
 open class Student{
     open var firstName:String = "null"
     open var lastName:String = "null"
     open var group:String = "null"
     open var averageMark:Double=0.0
     open var scholarship:Int=0

     constructor( firstName:String, lastName:String, group:String, averageMark:Double){
         this.firstName=firstName
         this.lastName=lastName
         this.group = group
         this.averageMark=averageMark
              }

     open fun getScholarship(){
         if (averageMark==5.0){
             scholarship=100
         }else {
             scholarship=80
         }
     }

 }

class Aspirant : Student{
    override  var firstName:String = "null"
    override var lastName:String = "null"
    override var group:String = "null"
    override var averageMark:Double=0.0
    override var scholarship:Int=0
    var scienceWork:String = "null"

    constructor( firstName:String, lastName:String, group:String, averageMark:Double):super
        ( firstName, lastName, group, averageMark){
        this.firstName=firstName
        this.lastName=lastName
        this.group = group
        this.averageMark=averageMark
    }

    override fun getScholarship(){
        if (averageMark==5.0){
            scholarship=200
        }else {
            scholarship=180
        }
    }
}