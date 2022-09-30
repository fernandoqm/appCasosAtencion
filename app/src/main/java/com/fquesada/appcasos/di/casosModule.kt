package com.fquesada.appcasos.di

import com.fquesada.appcasos.data.constants.ApiConstant
import com.fquesada.appcasos.data.remote.casosApi.casosApi
import com.fquesada.appcasos.domain.model.Casos
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CasosApiModule {

    @Provides
    @Singleton
    fun provideApi(builder:Retrofit.Builder): casosApi{
        return builder
            .build()
            .create(casosApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(ApiConstant.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
    }



}