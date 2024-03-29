package com.zup.teste.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity
data class FilmeModel(

    @Expose
    @SerializedName("imdbID")
    @PrimaryKey
    val id: String,

    @Expose
    @SerializedName("Title")
    val titulo: String,

    @Expose
    @SerializedName("Year")
    val ano: String,

    @Expose
    @SerializedName("Poster")
    val poster: String,

    @Expose
    @SerializedName("Genre")
    val genero: String,

    @Expose
    @SerializedName("Director")
    val diretores: String,

    @Expose
    @SerializedName("Actors")
    val atores: String,

    @Expose
    @SerializedName("Plot")
    val enredo: String

)

data class FilmesModel(

    @Expose
    @SerializedName("Search")
    val busca: List<FilmeModel>
)
