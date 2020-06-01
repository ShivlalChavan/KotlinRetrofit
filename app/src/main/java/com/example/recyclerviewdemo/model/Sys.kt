package com.example.recyclerviewdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Sys {
    @SerializedName("country")
    @Expose
    private var country: String? = null
    @SerializedName("sunrise")
    @Expose
    private var sunrise: String? = null
    @SerializedName("sunset")
    @Expose
    private var sunset: String? = null

    fun getCountry(): String? {
        return country
    }

    fun setCountry(country: String) {
        this.country = country
    }

    fun getSunrise(): String? {
        return sunrise
    }

    fun setSunrise(sunrise: String) {
        this.sunrise = sunrise
    }

    fun getSunset(): String? {
        return sunset
    }

    fun setSunset(sunset: String) {
        this.sunset = sunset
    }

}