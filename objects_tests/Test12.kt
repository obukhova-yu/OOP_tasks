package objects_tests

fun main(){
    val milk=Product("milk",25,2.5)
    val bread=Product("bread",15,1.75)
    val cheese=Product("cheese",55,3.5)
    val butter=Product("butter",52,1.78)
    val bun=Product("bun",12,2.25)
    val chicken=Product("chicken",78,4.12)
    val pork=Product("pork",130,3.2)

    var dairy: MutableList<Any> =  mutableListOf(butter,milk,cheese)
    val meat: MutableList<Any> =  mutableListOf(chicken,pork)
    val bakery: MutableList<Any> =  mutableListOf(bread,bun)

    var dairyCategory=Category("dairy",prodArray = dairy)
    var meatCategory=Category("meat",prodArray = meat)
    var bakeryCategory=Category("bakery",prodArray = bakery)

    var basket123=Basket()
    basket123.purchasedGoods = mutableListOf(milk,bun,butter,cheese,chicken)

    val ivanov123=User("Ivanov","123",basket123)


}
class Product(var name:String, var price:Int, var rating: Double){}

class Category(val name: String, var prodArray: MutableList<Any> = mutableListOf()){}

class Basket(){
    var purchasedGoods:MutableList<Any> = mutableListOf()
}

class User(var userName:String,var password:String,var basket: Basket){}
