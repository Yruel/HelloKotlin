package textadventure

import kotlin.system.exitProcess

fun fight(spieler: IngameCharacter, npc: IngameCharacter) {
    while (spieler.isDead() or npc.isDead()) {
        val starter = (0..1).random()
        if (starter == 0) {
            npc.receiveDamage(spieler.dealDamage())
        } else {
            spieler.receiveDamage(npc.dealDamage())
        }
    }

    if (spieler.isDead()) {
        println("You died. Try again.")
        System.exit(1)
    }
}
