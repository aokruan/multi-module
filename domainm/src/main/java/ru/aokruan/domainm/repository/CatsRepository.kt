package ru.aokruan.domainm.repository

import ru.aokruan.domainm.models.Cat

interface CatsRepository {
    fun getAll(): List<Cat>
}