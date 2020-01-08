fun main() {
    loop@while (true) {
        println("Gebe eine Zahl ein")
        val reihe = Integer.valueOf(readLine())
        if (reihe == 0)
            break@loop
        for (i in reihe..100)
            if (i % reihe == 0)
                println(i)
    }
}