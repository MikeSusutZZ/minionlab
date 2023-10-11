package com.bcit.lab4mikesusut

import kotlin.random.Random

class Hunt(override val minion: Minion, item: Item? = null) : Mission(item), Repeatable {

    override fun determineMissionTime(): Int {
        val itemModifier = item?.timeModifier ?: 0
        return (minion.baseHealth + minion.baseSpeed + itemModifier) * Random.nextInt(0, 5)
    }

    override fun reward(time: Int): String {
        if(minion is Elf) {
            return (minion as Elf).huntReward(time)
        }
        return when (time) {
            in 11..20 -> "mouse"
            in 21..30 -> "fox"
            in 31..40 -> "buffalo"
            in 41..60 -> "dinosaur"
            else -> "nothing"
        }
    }

    override val repeatNum = 3

    override fun repeat(times: Int, listener: MissionListener) {
        val toRepeat = if(times > repeatNum) repeatNum else times
        for (i in 1..toRepeat) {
            start(listener)
        }
    }
}
