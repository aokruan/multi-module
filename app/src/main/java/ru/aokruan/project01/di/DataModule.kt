package ru.aokruan.project01.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.aokruan.datam.repository.CatsRepositoryImpl
import ru.aokruan.datam.service.Service
import ru.aokruan.datam.storage.DataStorage
import ru.aokruan.datam.storage.DataStorageImpl
import ru.aokruan.domainm.repository.CatsRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideStorage(service: Service): DataStorage = DataStorageImpl(service)

/*    @Provides
    @Singleton
    fun provideRepository(dataStorage: DataStorage): CatsRepository = CatsRepositoryImpl(dataStorage)*/
}