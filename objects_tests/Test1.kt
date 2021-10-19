package objects_tests

fun main(){

    val phone1=Phone(1234567, "nokia",235)
    val phone2=Phone(2364587, "samsung")
    val phone3=Phone(5484876,"ergo")

    println(phone1.number.toString()+" "+phone1.model+" "+phone1.weight.toString())
    println(phone2.number.toString()+" "+phone2.model+" "+phone2.weight.toString())
    println(phone3.number.toString()+" "+phone3.model+" "+phone3.weight.toString())

    phone1.receiveCall("Vova",12358)
    phone2.receiveCall("Vera",0.255)
    phone3.receiveCall("Dasha",56689)

}

class Phone {
    var number:Int=0
    var model:String="null"
    var weight: Int=0

    constructor(number:Int, model:String) {
        this.number=number
        this.model=model}

    constructor(number:Int, model:String, weight: Int) {
        this.number=number
        this.model=model
        this.weight=weight
    }

    constructor()

    fun receiveCall(subscriberName:String, subscriberNumber:Int ){
        println("$subscriberName is calling $subscriberNumber")
    }
    fun receiveCall(subscriberName:String, subscriberNumber:Double ){
        println("$subscriberName is calling $subscriberNumber")
}

}





