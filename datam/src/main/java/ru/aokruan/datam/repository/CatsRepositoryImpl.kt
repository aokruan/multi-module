package ru.aokruan.datam.repository

import ru.aokruan.datam.storage.DataStorage
import ru.aokruan.domainm.models.Cat
import ru.aokruan.domainm.repository.CatsRepository
import javax.inject.Inject

class CatsRepositoryImpl @Inject constructor(private val dataStorage: DataStorage) : CatsRepository {
    override fun getAll(): List<Cat> {
        return dataStorage.getAllCats().map { it.toCat() }
    }
}