package com.fquesada.appcasos.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fquesada.appcasos.data.repository.CasosRepository
import com.fquesada.appcasos.domain.model.Casos
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CasosViewModel @Inject constructor(
    private val casosRepo: CasosRepository,
): ViewModel(){
    public var tipoCaso :Int = 0

    private val _state = MutableStateFlow(emptyList<Casos>())
    val state: StateFlow<List<Casos>>
    get() = _state

    init {
        viewModelScope.launch {
            if(tipoCaso == 0) {
                val casos = casosRepo.getAllCasos()
                _state.value = casos
            }
        }
    }

}