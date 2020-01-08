fun insert1(list: List<Any>, value: Any, index: Int): List<Any>? {
    return list.slice(0 until index) + value + list.slice(index until list.size)
}

fun insert2(list: List<Any>, value: Any, index: Int): List<Any> {
    return list.take(index) + value + list.drop(index)
}

fun main(args: Array<String>) {
    val basicList = listOf(4, 1, 2, 0, 3, 4)
    println("Die Liste lautet $basicList. Geben Sie eine Zahl ein und an welcher Stelle sie eingefügt werden soll...")
    print("Zahl: ")
    val value = Integer.valueOf(readLine())
    print("Stelle: ")
    val index = Integer.valueOf(readLine())
    val insertedList2 = insert2(basicList, value, index)
    println("Die neue Liste lautet nach Methode 2 $insertedList2")
    val insertedList1 = insert1(basicList, value, index)
    println("Die neue Liste lautet nach Methode 1 $insertedList1")
}