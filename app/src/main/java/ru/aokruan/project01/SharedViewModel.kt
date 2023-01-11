package ru.aokruan.project01

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import ru.aokruan.domain.models.Cat
import ru.aokruan.domain.usecases.GetAllCatsUseCase
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class SharedViewModel @Inject constructor(private val getAllCatsUseCase: GetAllCatsUseCase) : ViewModel() {
    private val _cats: MutableLiveData<List<Cat>> = MutableLiveData(listOf())
    val cats: LiveData<List<Cat>> = _cats

    fun getAllCats() {
        getAllCatsUseCase.execute()
    }

    init {
        Timber.tag(TAG).i("ViewModel is started")
    }

    companion object {
        const val TAG = "SharedViewModel"
    }
}