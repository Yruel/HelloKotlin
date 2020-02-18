package textadventure

class Spieler: IngameCharacter(100, 5) {
    val inventar = mutableListOf<Item>()

    fun pickUp(i: Item) {
        inventar.add(i)
    }

    companion object {
        private val instance: Spieler = Spieler()
        fun getInstance(): Spieler {
            return instance
        }
    }
}
