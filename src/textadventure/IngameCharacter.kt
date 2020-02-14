package textadventure

open class IngameCharacter(maxhp: Int, hp: Int, dmg: Int) {
    var maxhp: Int = maxhp
    var hp: Int = hp
    var dmg: Int = dmg

    fun isDead(): Boolean {
        return hp <= 0
    }

    fun receiveDamage(dmg: Int) {
        hp -= dmg
    }

    fun dealDamage(): Int {
        return dmg
    }
}
