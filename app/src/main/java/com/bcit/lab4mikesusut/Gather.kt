package com.bcit.lab4mikesusut

import kotlin.random.Random

class Gather(override val minion: Minion, item: Item? = null) : Mission(item) {

    override fun determineMissionTime(): Int {
        val itemModifier = item?.timeModifier ?: 0
        return (minion.backpackSize + minion.baseSpeed + itemModifier) * Random.nextInt(0, 5)
    }

    override fun reward(time: Int): String {
        return when (time) {
            in 10..21 -> "bronze"
            in 22..33 -> "silver"
            in 34..44 -> "gold"
            in 45..60 -> "diamond"
            else -> "nothing"
        }
    }
}
