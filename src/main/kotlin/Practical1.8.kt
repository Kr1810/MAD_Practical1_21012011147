import java.util.*
fun main() {
    val a = arrayOf(10, 90, 60, 80, 100)
    println("Create Array-1 by using arrayOf() method :")
    println(Arrays.deepToString(a))

    //val b =Array<Int>(5)->
      //  println("Create Array-2 by using Array<>() method :")
   // println(Arrays.deepToString(b))


   // println("Create Array-3 by using intarrayOf() method :")

    val intArr = IntArray(5)
    println("Create Array-4 by using intarrayOf() method :")
    println(intArr.joinToString(" "))
}