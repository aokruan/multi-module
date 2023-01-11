package ru.aokruan.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.aokruan.data.repository.CatsRepositoryImpl
import ru.aokruan.data.service.Service
import ru.aokruan.data.storage.DataStorage
import ru.aokruan.data.storage.DataStorageImpl
import ru.aokruan.domain.repository.CatsRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideStorage(service: Service): DataStorage = DataStorageImpl(service)

    @Provides
    @Singleton
    fun provideRepository(dataStorage: DataStorage): CatsRepository = CatsRepositoryImpl(dataStorage)
}