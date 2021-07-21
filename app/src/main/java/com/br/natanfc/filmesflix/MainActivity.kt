package com.br.natanfc.filmesflix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.br.natanfc.filmesflix.model.Movie
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        populateList()
    }

        private fun populateList(){
            moviesList.apply {
                hasFixedSize()
                adapter = MoviesAdapter(listOfMovies)
            }
        }
}