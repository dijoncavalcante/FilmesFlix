package com.br.natanfc.filmesflix.framework.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieRestApiTask {

    companion object {
        const val BASE_URL = "https://raw.githubusercontent.com/"
    }

    private fun movieProdiver(): Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun retrofitApi(): MovieApi = movieProdiver().create(MovieApi::class.java)
}