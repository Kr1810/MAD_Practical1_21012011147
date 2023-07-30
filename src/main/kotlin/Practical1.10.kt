class
Car (info : String ,
           Owner : String ,
           miles : Int ,
           OGPrice : Double ,
           currentPrice : Double) {
    var info:String
    var Owner:String
    var miles:Int
    var OGPrice:Double
    var currentPrice:Double
    init{
        println("Object of class is created and Init is called")
        this.info = info
        this.Owner = Owner
        this.miles = miles
        this.OGPrice = OGPrice
        this.currentPrice = currentPrice
    }
    fun getCarInformation(): String { return info }
    fun getOriginalCarPrice(): Double { return OGPrice }
    fun getCurrentCarPrice(): Double { return currentPrice }
    fun displayCarInfo(){
        println("----------")
        println("Car Information:${getCarInformation()}")
        println("Car Owner: $Owner")
        println("Miles Drive: $miles")
        println("Original Car Price:${getOriginalCarPrice()}")
        println("Current Car Price:${getCurrentCarPrice()}")
        println("----------\n")
    }
    fun main() {
        println("Creating Car Class Object car1 in next line")
        val car1 = Car("Datsun, 2014", "ridham", 205, 20000.0, 98950.0)
        car1.displayCarInfo()

        println("Creating Car Class Object car2 in next line")
        val car2 = Car("Innova, 2019", "jigar", 20, 600000.0, 399800.0)
        car2.displayCarInfo()

        println("\n********** ArrayList of Car **********")
        val carlist = ArrayList<Car>()

        carlist.add(Car("Mahindra,2019", "meera", 150, 4900000.0, 1079000.0))
        carlist.add(Car("Maruti,2018", "fiza", 390, 6600000.0, 4008000.0))
        carlist[0].displayCarInfo()
        carlist[1].displayCarInfo() }}