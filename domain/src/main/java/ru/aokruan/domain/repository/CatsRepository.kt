package ru.aokruan.domain.repository

import ru.aokruan.domain.models.Cat

interface CatsRepository {
    fun getAll(): List<Cat>
}