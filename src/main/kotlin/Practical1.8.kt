fun main(){
    println("create Array-1 by using array of method:")
    var arr1= arrayOf(1,2,3,4,5)
    println(arr1.joinToString ())
    println("Create Array-2 by using Array<>():")
    var arr2 = arrayOf<String>("k","r","i","n","a")
    //contentDeepToString
    println(arr2.contentDeepToString())
    println("Create Array-3 by using Array<>() and lambda function:")
    var arr3 = Array(5){i:Int->i}
    println("*************Before Sorting Without Builtin Function***************")
    println(arr3.joinToString())
    for(i in 0 until arr3.size)
    {for(j in i+1 until arr3.size)

    {
        if(arr3[i]<arr3[j])
        {
            arr3[j]=arr3[j]+arr3[i]
            arr3[i]=arr3[j]-arr3[i]
            arr3[j]=arr3[j]-arr3[i]}}}
    println("*************After Sorting Without Built-in Function***************")
            println(arr3.joinToString())
            println("Create Array-4 by using IntArray():")
    var arr4 = IntArray(5)
    //until
    for(i in 0 until arr4.size)
    {
        print("a[$i]: ")
        arr4[i]= readLine()!!.toInt()

    }
    println("Create Array-5 by using intArrayof () :")
    var arr5 = intArrayOf(45,56,78,23,78)
    println("*************Before Sorting With Built-in Function***************")
            println(arr5.joinToString())
            //Sort
            arr5.sort()
            println("*************After Sorting With Built-in Function***************")
            println(arr5.joinToString())
            println("Create 20 Array-6 by using arrayof() and intArrayof() :")
    var arr6 = arrayOf(intArrayOf(1,1),
        intArrayOf(5,6,7))
    for(i in 0 until arr6.size)
    {
        for(j in 0 until arr6[i].size)
        { print(arr6[i][j]) }
        println()}
    val num= 10
    println("************* Use In Range ***************")
    if (num in 5..10) {
        println("in range")
    }
    println("************* Use Not in Range ***************")
        if(num !in 5 .. 10)
        {
            println("not in range")
        }
                println("************* Use Step ***************")
        for (x in 1..10 step 4) {
            print("$x ")
        }
                println()
                println("************* Use downTo ***************")
        for (x in 10 downTo 0 step 7) {
            print("$x ")
        }
                println()
}
