package ru.aokruan.domain.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import ru.aokruan.domain.repository.CatsRepository
import ru.aokruan.domain.usecases.GetAllCatsUseCase

@Module
@InstallIn(ViewModelComponent::class)
object DomainModule {
    @Provides
    @ViewModelScoped
    fun provideGetAllCatsUseCase(catsRepository: CatsRepository): GetAllCatsUseCase = GetAllCatsUseCase(catsRepository)
}