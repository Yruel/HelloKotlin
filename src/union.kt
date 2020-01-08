fun List<Int>.containsTimes(value: Int, times: Int): Boolean {
    return this.filter { it == value }.size == times
}

fun main(args: Array<String>) {
    val basicList = listOf(1, 2, 3, 3)
    println((basicList + listOf(4, 4, 5)).distinct())
    println(basicList.union(listOf(4, 4, 5)))

    println(basicList.containsTimes(3, 2))
}