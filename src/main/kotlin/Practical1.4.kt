fun main(){
    println("Enter number:")
    val a = readLine()?.toIntOrNull()
    if (a!=null){
        if (a%2==0){
        println("$a is even number")
    }         else{
        println("$a is odd number")
    }     }     else{
        println("Please enter valid number!")
    }
}
