package com.example.recyclerviewdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Coord {

    @SerializedName("lon")
    @Expose
    private var lon: String? = null
    @SerializedName("lat")
    @Expose
    private var lat: String? = null

    fun getLon(): String? {
        return lon
    }

    fun setLon(lon: String) {
        this.lon = lon
    }

    fun getLat(): String? {
        return lat
    }

    fun setLat(lat: String) {
        this.lat = lat
    }
}