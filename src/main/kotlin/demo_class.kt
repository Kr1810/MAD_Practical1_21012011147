//class  person (var EnrollmentNo : Int , var name : String)
//{
    /*constructor(): this(147, "krina"){
        println("Enrollment number : $EnrollmentNo")
        println("name: $name")
    }*/
     /*init {
         println("enrollment no : $EnrollmentNo  , name : $name")
     }*/

//}
/*fun main()
{
    var s = person(147, "krina")
}*/

class Person{
    var eno : Int
    var name: String
    var age: Int
    init {
        println("Initializer Block")
    }

    // Secondary Constructor
    constructor ( eno: Int ,name: String, age: Int) {
        this. eno= eno
        this.name = name
        this.age = age
        println("Eno = $eno")
        println("Name = $name")
        println("Age = $age")
    }
}
fun main() {
    val zara = Person(147,"Zara", 20)
}