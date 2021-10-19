package objects_tests

fun main(){

    val personJames = Person("James Bond", 42)
    val personKatty = Person("Katty Perry", 38)
    val personWill = Person()

    personJames.personMove()
    personKatty.personTalk()
    personWill.personHelloWorld()
}

class Person{
    var fullName:String="null"
    var age:Byte=0

    constructor(fullName:String, age:Byte){
        this.fullName=fullName
        this.age=age
    }
    constructor()

    fun personMove(){
        println("$fullName is walking!")
    }

    fun personTalk(){
        println("$fullName is talking!")
    }
    fun personHelloWorld(){
        println("Hello World!")
    }
}