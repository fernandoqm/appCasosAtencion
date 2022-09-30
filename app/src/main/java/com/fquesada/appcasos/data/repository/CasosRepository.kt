package com.fquesada.appcasos.data.repository

import com.fquesada.appcasos.data.remote.casosApi.casosApi
import com.fquesada.appcasos.domain.model.Casos
import javax.inject.Inject

class CasosRepository @Inject constructor(
    private val casosApi: casosApi
) {
    suspend fun getAllCasos(): List<Casos>{
        return casosApi.getAllCasos()
    }
}