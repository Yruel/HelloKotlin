open class A {
    open fun bar() = "AAA"
}

class B: A() {
    override fun bar() = "BBB"
}

// fun A.bar() = "AAA"

// fun B.bar() = "BBB"

fun printMe(a: A) {
    println(a.bar())
}

fun main(args: Array<String>) {
    val b: B = B()
    println(b.bar());

    val a: A = b

    printMe(b)
}