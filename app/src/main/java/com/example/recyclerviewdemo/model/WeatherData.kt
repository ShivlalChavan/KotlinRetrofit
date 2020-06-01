package com.example.recyclerviewdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class WeatherData {
    @SerializedName("coord")
    @Expose
    private var coord: Coord? = null
    @SerializedName("weather")
    @Expose
    private var weather: List<Weather>? = null
    @SerializedName("base")
    @Expose
    private var base: String? = null
    @SerializedName("main")
    @Expose
    private var main: Main? = null
    @SerializedName("wind")
    @Expose
    private var wind: Wind? = null
    @SerializedName("rain")
    @Expose
    private var rain: Rain? = null
    @SerializedName("clouds")
    @Expose
    private var clouds: Clouds? = null
    @SerializedName("dt")
    @Expose
    private var dt: String? = null
    @SerializedName("sys")
    @Expose
    private var sys: Sys? = null
    @SerializedName("timezone")
    @Expose
    private var timezone: String? = null
    @SerializedName("id")
    @Expose
    private var id: String? = null
    @SerializedName("name")
    @Expose
    private var name: String? = null
    @SerializedName("cod")
    @Expose
    private var cod: String? = null

    fun getCoord(): Coord? {
        return coord
    }

    fun setCoord(coord: Coord) {
        this.coord = coord
    }

    fun getWeather(): List<Weather>? {
        return weather
    }

    fun setWeather(weather: List<Weather>) {
        this.weather = weather
    }

    fun getBase(): String? {
        return base
    }

    fun setBase(base: String) {
        this.base = base
    }

    fun getMain(): Main? {
        return main
    }

    fun setMain(main: Main) {
        this.main = main
    }

    fun getWind(): Wind? {
        return wind
    }

    fun setWind(wind: Wind) {
        this.wind = wind
    }

    fun getRain(): Rain? {
        return rain
    }

    fun setRain(rain: Rain) {
        this.rain = rain
    }

    fun getClouds(): Clouds? {
        return clouds
    }

    fun setClouds(clouds: Clouds) {
        this.clouds = clouds
    }

    fun getDt(): String? {
        return dt
    }

    fun setDt(dt: String) {
        this.dt = dt
    }

    fun getSys(): Sys? {
        return sys
    }

    fun setSys(sys: Sys) {
        this.sys = sys
    }

    fun getTimezone(): String? {
        return timezone
    }

    fun setTimezone(timezone: String) {
        this.timezone = timezone
    }

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getName(): String? {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getCod(): String? {
        return cod
    }

    fun setCod(cod: String) {
        this.cod = cod
    }
}