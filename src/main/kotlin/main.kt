fun main () {
    val names:Array<String> = arrayOf("Jim", "John", "Jenny")
    val numbers = arrayOf(
        arrayOf(1,2,3),
        arrayOf(4,5,6),
        arrayOf(7,8,9)
    )
    println(numbers[1][1])
    names[0] = "Jeremy"
    println(names[0][2])
    println(names[0].length)
    println("Numbers of elements: ${names.size}")
    println("first element: ${names[0]}")
    println("last element: ${names[2]}")
}