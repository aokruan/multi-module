package ru.aokruan.data.storage

import ru.aokruan.data.models.Cat

interface DataStorage {
    fun getAllCats(): List<Cat>
}