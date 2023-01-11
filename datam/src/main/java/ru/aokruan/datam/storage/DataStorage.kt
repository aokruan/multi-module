package ru.aokruan.datam.storage

import ru.aokruan.datam.models.Cat

interface DataStorage {
    fun getAllCats(): List<Cat>
}