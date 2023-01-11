package ru.aokruan.data.storage

import ru.aokruan.data.models.Cat
import ru.aokruan.data.service.Service

class DataStorageImpl(private val api: Service) : DataStorage {
    override fun getAllCats(): List<Cat> {
        return /*api.getAllCats().body()?.map { it.toCat() } ?:*/ listOf()
    }
}