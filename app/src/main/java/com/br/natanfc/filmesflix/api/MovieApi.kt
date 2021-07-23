package com.br.natanfc.filmesflix.api

import com.br.natanfc.filmesflix.model.Movie
import retrofit2.Call
import retrofit2.http.GET

interface MovieApi {
    //https://raw.githubbusercontent.com/natanfelipe/FilmesFlixJson/master/movieList
    @GET("natanfelipe/FilmesFlixJson/master/movieList")
    fun getAllMovies(): Call<List<Movie>>
}