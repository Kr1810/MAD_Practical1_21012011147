fun main(args: Array<String>){
    val number = 5
    val result :Float
    result = factorial(number)
    println("Enter number: $number")
    println("Factorial of $number = $result")
    println("By TailRec keyword , Factorial of $number = $result")
}
fun factorial(n:Int):Float
{
    return if(n == 1)
    {
         n.toFloat()
     }
     else n * factorial(n-1)
}