package com.feature.movie.ui.screen

import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.core.common.Resource
import com.feature.movie.domain.use_cases.GetMovieListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieScreenViewModel @Inject constructor(
    private val getMovieListUseCase: GetMovieListUseCase
): ViewModel(){

    var query by mutableStateOf("")

    private val _state = mutableStateOf(MainScreenState())
    val state: State<MainScreenState> = _state

    val API_KEY = "20cb18d90f887a4a07bc494d61bd8330"

    fun getMovieList(){
        getMovieListUseCase(API_KEY, query).onEach { result ->
            when(result){
                is Resource.Success -> {
                    _state.value = MainScreenState(movies = result.data ?: emptyList())
                }
                is Resource.Loading -> {
                    _state.value = MainScreenState(isLoading = true)
                }
                is Resource.Error -> {
                    _state.value = MainScreenState(message = result.message ?: "Unknown error occurred")
                }
            }
        }.launchIn(viewModelScope)
    }
}