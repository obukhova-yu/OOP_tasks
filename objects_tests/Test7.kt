package objects_tests

fun main(){
    val ivanov =Driver("Ivanov I.I.",5)
    val petrov = Driver("Petrov P.P.",2)
    val smirnov = Driver("Smirnov S.S.",4)

    val bmwEngine = Engine("bmw",2200)
    val hondaEngine = Engine("Honda",3500)
    val renaultEngine = Engine("Renault",3000)

    val bmw= Car("B",bmwEngine,"BMW",2500,ivanov)
    val honda = sportCar("C",hondaEngine,"Honda",2200,petrov,300)
    val renault = Lorry("A",renaultEngine,"Renault",3000,smirnov, 3000)

    bmw.infoToString()
    honda.infoToString()
    renault.infoToString()
    ivanov.infoToString()
    bmwEngine.infoToString()
}

class Driver(var fullName:String,var experience:Byte){
    fun infoToString(){
        println("Drivers full name: $fullName, expierence: $experience")
    }
}

class Engine(var company:String, var power:Int){
    fun infoToString(){
        println("Engine company: $company, engine power: $power")
    }
}

open class Car{
    open var carClass:String="A"
    open var engine:Engine= Engine("volvo",1500)
    open var marka:String="volvo"
    open var weight:Int=2000
    open var driver: Driver= Driver(" ",0)

    constructor(carClass:String, engine:Engine, marka:String, weight:Int, driver: Driver){
       this.carClass=carClass
        this.engine=engine
        this.marka=marka
        this.weight=weight
        this.driver=driver
    }

    fun start(){
        println("$marka start moving")
    }

    fun stop(){
        println("$marka stop")
    }

    fun turnLeft(){
        println("$marka turn left")
    }

    fun turnRight(){
        println("$marka turn right")
    }
    open fun infoToString(){
        println("Marka: $marka,car class: $carClass engine: ${engine.company} ${engine.power}, weight: $weight, driver: ${driver.fullName} ")
    }
    }

class Lorry:Car {
    override var carClass: String = "A"
    override var engine: Engine = Engine("renault", 1500)
    override var marka: String = "renault"
    override var weight: Int = 5000
    override var driver: Driver = Driver(" ", 0)
    var carrying: Int = 5000

    constructor(carClass: String, engine: Engine, marka: String, weight: Int, driver: Driver, carrying: Int) : super(
        carClass,
        engine,
        marka,
        weight,
        driver
    ) {
        this.carClass = carClass
        this.engine = engine
        this.marka = marka
        this.weight = weight
        this.driver = driver
        this.carrying = carrying
    }

    override fun infoToString() {
        println("Marka: $marka,car class: $carClass engine: ${engine.company} ${engine.power}, weight: $weight, carrying: $carrying, driver: ${driver.fullName} ")
    }
}
    class sportCar:Car {
        override var carClass: String = "standart"
        override var engine: Engine = Engine("volvo", 1500)
        override var marka: String = "volvo"
        override var weight: Int = 2000
        override var driver: Driver = Driver(" ", 0)
        var maxSpeed: Int = 250

        constructor(
            carClass: String,
            engine: Engine,
            marka: String,
            weight: Int,
            driver: Driver,
            maxSpeed: Int
        ) : super(carClass, engine, marka, weight, driver) {
            this.carClass = carClass
            this.engine = engine
            this.marka = marka
            this.weight = weight
            this.driver = driver
            this.maxSpeed = maxSpeed
        }
        override fun infoToString(){
            println("Marka: $marka,car class: $carClass engine: ${engine.company} ${engine.power}, weight: $weight, max speed: $maxSpeed, driver: ${driver.fullName} ")
        }
    }
