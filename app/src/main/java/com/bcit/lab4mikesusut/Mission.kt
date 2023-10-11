package com.bcit.lab4mikesusut

abstract class Mission(protected val item: Item? = null) {
    protected abstract val minion: Minion

    fun start(listener: MissionListener) {
        println(minion.catchphrase)
        listener.missionStart(minion)
        listener.missionProgress()
        listener.missionComplete(minion, reward(determineMissionTime()))
    }

    protected abstract fun determineMissionTime(): Int
    protected abstract fun reward(time: Int): String
}
