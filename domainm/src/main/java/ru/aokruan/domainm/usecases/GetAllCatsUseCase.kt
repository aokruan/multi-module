package ru.aokruan.domainm.usecases

import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import ru.aokruan.domainm.models.Cat
import ru.aokruan.domainm.repository.CatsRepository
import javax.inject.Inject

class GetAllCatsUseCase @Inject constructor (private val catsRepository: CatsRepository) {
    fun execute(): List<Cat> {
        return catsRepository.getAll()
    }
}