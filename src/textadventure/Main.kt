package textadventure

fun main(args: Array<String>) {
    val spieler = Spieler()
    val feld = Spielfeld()
    feld.spawnPlayer(0, 0)

    while (true) {
        if (spieler.isDead()) {
            break
        }
        print("Wohin des Weges? N/S/O/W")
        val input = readLine()
        when(input) {
            "N" -> {
                feld.movePlayer(0, -1)
            }
            "S" -> {
                feld.movePlayer(0, 1)
            }
            "O" -> {
                feld.movePlayer(1, 0)
            }
            "W" -> {
                feld.movePlayer(-1, 0)
            }
        }
        feld.interact()
    }
}
