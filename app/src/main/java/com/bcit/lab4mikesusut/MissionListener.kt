package com.bcit.lab4mikesusut

interface MissionListener {
    fun missionStart(minion: Minion): Unit
    fun missionProgress(): Unit
    fun missionComplete(minion: Minion, result: String): Unit
}
