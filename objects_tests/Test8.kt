package objects_tests

fun main(){
    val dog=Dog("Snoppy","dogs food","home dog",true)
    val cat = Cat("Kitty","meat","home cat",true)
    val horse = Horse("Ruby","grass","farm",false)

    val petrov = Vetirinar()

    petrov.animalTreatFood()


}
open class Animal{
    open var food:String="any"
    open var location:String="any"

    constructor(food:String,location:String){
        this.food=food
        this.location=location
    }
   open fun makeNoise(){
        println("Oopps")
    }
   open fun sleep(){
        println("Animal is sleeping")
    }
   open fun eat(){
        println("Animal is eating")
    }
}
class Dog:Animal{
    var animalName:String="any"
    override var food:String="any"
    override var location:String="any"
    var isHunting:Boolean=true

    constructor(animalName:String,food:String,location:String,isHunting:Boolean):super(food,location){
        this.animalName=animalName
        this.food=food
        this.location=location
        this.isHunting=isHunting
    }
   override fun makeNoise(){
        println("Woff!")
    }
    override fun sleep(){
        println("Dog is sleeping")
    }
    override fun eat(){
        println("Dog is eating $food")
    }
}
class Cat:Animal{
    var animalName:String="any"
    override var food:String="any"
    override var location:String="any"
    var isPedigreed:Boolean=true

    constructor(animalName:String,food:String,location:String,isPedigreed:Boolean):super(food,location){
        this.animalName=animalName
        this.food=food
        this.location=location
        this.isPedigreed=isPedigreed
    }
    override fun makeNoise(){
        println("Meow!")
    }
    override fun sleep(){
        println("Cat is sleeping")
    }
    override fun eat(){
        println("Cat is eating $food")
    }
}
class Horse:Animal{
    var animalName:String="any"
    override var food:String="any"
    override var location:String="any"
    var isBreeding:Boolean=true

    constructor(animalName:String,food:String,location:String,isBreeding:Boolean):super(food,location){
        this.animalName=animalName
        this.food=food
        this.location=location
        this.isBreeding=isBreeding
    }
    override fun makeNoise(){
        println("Eohoho!")
    }
    override fun sleep(){
        println("Horse is sleeping")
    }
    override fun eat(){
        println("Horse is eating $food")
    }
}


class Vetirinar(){

    fun animalTreatFood(){

        val animals = listOf(Dog("Dog","dogs food","home dog",true),
            Cat("Cat","meat","home cat",true),
            Horse("Horse","grass","farm",false))

        println(animals.forEach(){it.eat()})

    }
}