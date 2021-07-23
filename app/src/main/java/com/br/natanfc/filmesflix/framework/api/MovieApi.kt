package com.br.natanfc.filmesflix.framework.api

import com.br.natanfc.filmesflix.domain.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {
    //https://raw.githubbusercontent.com/natanfelipe/FilmesFlixJson/master/movieList
    @GET("natanfelipe/FilmesFlixJson/master/moviesList")
    fun getAllMovies(): Call<List<Movie>>
}