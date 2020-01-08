import kotlin.math.PI

class Circle(var radius: Double) {

    fun area(): Double = radius * radius * PI
}

fun main() {
    val c: Circle = Circle(1.0)
    c.radius = 5.0
    println(c.area())
}