package com.bcit.lab4mikesusut

interface Repeatable {
    val repeatNum: Int
    fun repeat(times: Int, listener: MissionListener): Unit
}
