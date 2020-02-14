fun main(args: Array<String>) {
    val myPair: Pair<String, Int> = Pair("hello", 0)
    val myMap: Map<String, Int> = mapOf(myPair, "world" to 42)
    println(myMap.toString())
    println(myMap["world"])
}
