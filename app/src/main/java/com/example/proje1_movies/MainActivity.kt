package com.example.proje1_movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.show_movie_fragment.*

class MainActivity : AppCompatActivity() {

    private lateinit var movieList: ArrayList<MovieModel>
    private var recyclerView: RecyclerView? = null
    private var jsonSerializer: JSONSerializer? = null
    private var adapter: MovieAdapter? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        floatingActionButton.setOnClickListener { view ->
            val dialog =MovieModel()
            dialog.show(supportFragmentManager, "")
        }
    }

    fun showMovie(movieToShow: Int)  // main activity show the data
    { /*
         fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            //Animation of editing button
            btn_edit.setOnClickListener {
                btn_edit.animate().apply {
                    duration= 1
                }.start()
            }

            //Animation of deleting button
            btn_delete.setOnClickListener {
                btn_delete.animate().apply {
                    duration = 1
                }.start()
            }
        } */
    }

}

