fun main(args: Array<String>){
    val number = 10
    val result :Long
    result = factorial(number)
    println("Enter number: $number")
    println("Factorial of $number = $result")
    println("By TailRec keyword , Factorial of $number = $result")
}
fun factorial(n:Int):Long
{
    return if(n == 1)
    {
         n.toLong()
     }
     else n * factorial(n-1)
}