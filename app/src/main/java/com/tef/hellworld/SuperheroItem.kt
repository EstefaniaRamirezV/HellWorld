package com.tef.hellworld


import com.google.gson.annotations.SerializedName

data class SuperheroItem(
    @SerializedName("alias")
    val alias: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("facebook")
    val facebook: String,
    @SerializedName("height")
    val height: Double,
    @SerializedName("name")
    val name: String,
    @SerializedName("occupation")
    val occupation: String,
    @SerializedName("powers")
    val powers: String,
    @SerializedName("urlPicture")
    val urlPicture: String
)