package ru.aokruan.domainm.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import ru.aokruan.domainm.repository.CatsRepository
import ru.aokruan.domainm.usecases.GetAllCatsUseCase
import javax.inject.Singleton

@Module
@InstallIn(ViewModelComponent::class)
object DomainModule {
    @Provides
    @ViewModelScoped
    fun provideGetAllCatsUseCase(catsRepository: CatsRepository): GetAllCatsUseCase = GetAllCatsUseCase(catsRepository)
}