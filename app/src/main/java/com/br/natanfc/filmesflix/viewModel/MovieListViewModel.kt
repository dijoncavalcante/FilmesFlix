package com.br.natanfc.filmesflix.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.br.natanfc.filmesflix.model.Movie

class MovieListViewModel : ViewModel() {

    private val listOfMovies = arrayListOf(
        Movie(
            id = 0,
            titulo = "Kotlin is Easy",
            descricao = null,
            imagem = null,
            dataLancamento = null
        ),
        Movie(
            id = 1,
            titulo = "Dijon in Action",
            descricao = null,
            imagem = null,
            dataLancamento = null
        )
    )

    private var _movieList = MutableLiveData<List<Movie>>()
    val movieList: LiveData<List<Movie>>
        get() = _movieList

    fun init() {
        getAllMovies()
    }

    private fun getAllMovies() {
        _movieList.value = listOfMovies
    }
}