package com.fquesada.appcasos.data.remote.casosApi

import com.fquesada.appcasos.data.constants.ApiConstant
import com.fquesada.appcasos.domain.model.Casos
import retrofit2.http.GET

interface casosApi {

    @GET(ApiConstant.END_POINTS)
    suspend fun getAllCasos(): List<Casos>
}