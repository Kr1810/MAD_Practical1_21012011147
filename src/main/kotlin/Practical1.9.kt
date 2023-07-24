fun main (args : Array<String> ){

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
        }
    }