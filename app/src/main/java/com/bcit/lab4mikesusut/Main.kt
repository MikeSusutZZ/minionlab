package com.bcit.lab4mikesusut

fun main() {
    val elf = Elf()
    val orc = Orc(elf)

    val huntMissionForElf = Hunt(elf)
    val huntMissionForOrc = Hunt(orc)

    val listener = object : MissionListener {
        override fun missionStart(minion: Minion) {
            println("An ${minion.race} started a new hunt!")
        }

        override fun missionProgress() {
            println("...")
            println("...")
        }

        override fun missionComplete(minion: Minion, result: String) {
            println("An ${minion.race} has returned from a hunt, and found a $result!")
        }
    }

    val gatherMissionForElf = Gather(elf, Item.COMPASS)

    val listenerGather = object : MissionListener {
        override fun missionStart(minion: Minion) {
            println("An ${minion.race} started gathering!")
        }

        override fun missionProgress() {
            println("...")
            println("...")
        }

        override fun missionComplete(minion: Minion, result: String) {
            println("An ${minion.race} has returned from gathering and got: $result!")
        }
    }

    gatherMissionForElf.start(listenerGather)
    huntMissionForElf.repeat(3, listener)
    huntMissionForOrc.start(listener)
}
