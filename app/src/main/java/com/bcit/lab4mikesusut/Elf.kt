package com.bcit.lab4mikesusut

class Elf : Minion {
    override val race = "Elf"
    override val baseHealth = 2
    override val baseSpeed = 8
    override val backpackSize = 3
    override val catchphrase = "My arrows never miss!"

    fun huntReward(time: Int): String {
        return when (time) {
            in 11..20 -> "fish"
            in 21..30 -> "forest bear"
            in 31..40 -> "orc"
            in 41..60 -> "troll"
            else -> "nothing"
        }
    }
}
