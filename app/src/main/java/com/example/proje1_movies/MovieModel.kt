package com.example.proje1_movies

import androidx.fragment.app.FragmentManager
import org.json.JSONException
import org.json.JSONObject

private val JSON_MOVIE_NAME = "movie_name"
private val JSON_DESCRIPTION = "movie_description"
private val JSON_MOVIE_ACTOR = "movie_actor"
private val JSON_MOVIE_VIEW = "movie_view"
private val JSON_IS_WATCHED ="isWatched"

class MovieModel {
    var movieName: String? = null
    var movieDescription : String? = null
    var movieActor: String? =null
    var movieView: Int? = null
    var isWatched: Boolean = false

    @Throws(JSONException::class)
    constructor(jsonObject: JSONObject){
        movieName = jsonObject.getString(JSON_MOVIE_NAME)
        movieDescription= jsonObject.getString(JSON_DESCRIPTION)
        movieActor = jsonObject.getString(JSON_MOVIE_ACTOR)
        movieView = jsonObject.getInt(JSON_MOVIE_VIEW)
        isWatched = jsonObject.getBoolean(JSON_IS_WATCHED)
    }
    constructor(){

    }

    @Throws(JSONException::class)
    fun convertTOJSON(): JSONObject {
        val jsonObject = JSONObject()
        jsonObject.put(JSON_MOVIE_NAME,movieName)
        jsonObject.put(JSON_DESCRIPTION,movieDescription)
        jsonObject.put(JSON_MOVIE_ACTOR,movieActor)
        jsonObject.put(JSON_MOVIE_VIEW,movieView)
        jsonObject.put(JSON_IS_WATCHED,isWatched)

        return jsonObject
    }

    fun show(supportFragmentManager: FragmentManager, s: String) {
// TODO: 23.12.2020
    }

}