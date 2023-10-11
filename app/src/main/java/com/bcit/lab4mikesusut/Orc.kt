package com.bcit.lab4mikesusut

class Orc(elf: Minion) : Minion by elf {
    override val race = "Orc"
    override val catchphrase = "ARRGH!"
}
