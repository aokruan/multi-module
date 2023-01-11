package ru.aokruan.project01.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.aokruan.domainm.usecases.GetAllCatsUseCase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    /*@Provides
    fun provideUseCase(getAllCatsUseCase: GetAllCatsUseCase): GetAllCatsUseCase = getAllCatsUseCase*/
}