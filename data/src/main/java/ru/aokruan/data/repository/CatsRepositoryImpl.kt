package ru.aokruan.data.repository

import ru.aokruan.data.storage.DataStorage
import ru.aokruan.domain.models.Cat
import ru.aokruan.domain.repository.CatsRepository
import javax.inject.Inject

class CatsRepositoryImpl @Inject constructor(private val dataStorage: DataStorage) : CatsRepository {
    override fun getAll(): List<Cat> {
        return dataStorage.getAllCats().map { it.toCat() }
    }
}