fun addMe(a: Int, b: Int) = a + b

fun main(args: Array<String>) {
    val addMeTwice = {a: Int, b: Int -> a + b}
    println(addMe(42, 1337))
    println(addMeTwice(42, 1337))
}