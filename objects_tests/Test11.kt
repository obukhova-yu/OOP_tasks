package objects_tests

fun main(){
    val circ1=Circle(5,5)
    val circ2=Circle(5,5)

    val rect1 = Rectangle(3,3)
    val rect2 = Rectangle(5,8)

    val shapes = listOf(circ1,circ2,rect1,rect2)
    shapes.forEach(){it.draw()}

    println(circ1.equals(circ2).toString())
    println(rect1.equals(rect2).toString())
}

open class Shape(){
    open var color:String="any"

    open fun draw(){
        println("Shape is drawing")
    }
}

data class Rectangle(var x:Byte,var y:Byte):Shape(){
    override var color:String="any"

     override fun draw(){
        println("Rectangle is drawing")
    }
    override fun equals (other: Any?):Boolean {
        val b = other is Rectangle && ((x == other.x && y == other.y) || (x == other.y && y == other.x))
        return b
    }
}

data class Circle(var x:Byte,var y:Byte):Shape() {
    override var color: String = "any"

    override fun draw() {
        println("Circle is drawing")
    }

    override fun equals (other: Any?):Boolean {
        val b = other is Circle && ((x == other.x && y == other.y) || (x == other.y && y == other.x))
        return b
    }
}

