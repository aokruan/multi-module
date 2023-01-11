package ru.aokruan.datam.storage

import ru.aokruan.datam.models.Cat
import ru.aokruan.datam.service.Service

class DataStorageImpl(private val api: Service) : DataStorage {
    override fun getAllCats(): List<Cat> {
        return /*api.getAllCats().body()?.map { it.toCat() } ?:*/ listOf()
    }
}