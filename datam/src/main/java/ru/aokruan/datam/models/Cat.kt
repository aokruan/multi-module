package ru.aokruan.datam.models

import ru.aokruan.domainm.models.Cat

data class Cat(private val name: String) {
    fun toCat(): Cat {
        return Cat(name = this.name)
    }
}