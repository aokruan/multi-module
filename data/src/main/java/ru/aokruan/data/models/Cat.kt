package ru.aokruan.data.models

import ru.aokruan.domain.models.Cat

data class Cat(private val name: String) {
    fun toCat(): Cat {
        return Cat(name = this.name)
    }
}