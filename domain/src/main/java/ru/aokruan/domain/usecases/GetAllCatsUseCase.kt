package ru.aokruan.domain.usecases

import ru.aokruan.domain.models.Cat
import ru.aokruan.domain.repository.CatsRepository
import javax.inject.Inject

class GetAllCatsUseCase @Inject constructor (private val catsRepository: CatsRepository) {
    fun execute(): List<Cat> {
        return catsRepository.getAll()
    }
}