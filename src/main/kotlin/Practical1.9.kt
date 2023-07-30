/*fun main (args : Array<String> ){
    var a: ArrayList<Int> = ArrayList()
    a.add(57)
    a.add(90)
    a.add(10)
    a.add(13)
    a.add(14)
        val maxNum =a.max()
        if (maxNum != null) {
            println("Largest element is: $maxNum")
        } else {
            println("The list is empty.")
        }}*/

/*fun main() {
 var arrlist = ArrayList<Int>()
 for(i in 0..5)
 {
 print("arr[$i]: ")
 arrlist.add(readLine()!!.toInt())
 }
 var maxNum:Int
 maxNum=arrlist[0]
 for (i in arrlist) {
 if(maxNum<i)
 {
 maxNum=i
 }}
 println("Max number is: $maxNum")
 }*/

fun main() {
val numbers = arrayListOf(34,45,65,23,98)
val maxNum = numbers.maxOrNull()
if (maxNum != null) {
println("The Largest number is: $maxNum")
}
else {
println("The list is empty.")
}
}

