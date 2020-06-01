package com.example.recyclerviewdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Main{

@SerializedName("temp")
@Expose
private var temp: String? = null
@SerializedName("feels_like")
@Expose
private var feelsLike: String? = null
@SerializedName("temp_min")
@Expose
private var tempMin: String? = null
@SerializedName("temp_max")
@Expose
private var tempMax: String? = null
@SerializedName("pressure")
@Expose
private var pressure: String? = null
@SerializedName("humidity")
@Expose
private var humidity: String? = null
@SerializedName("sea_level")
@Expose
private var seaLevel: String? = null
@SerializedName("grnd_level")
@Expose
private var grndLevel: String? = null

fun getTemp(): String? {
    return temp
}

fun setTemp(tempp: String) {
    temp = tempp
}

fun getFeelsLike(): String? {
    return feelsLike
}

fun setFeelsLike(feelsLikee: String) {
   feelsLike = feelsLikee
}

fun getTempMin(): String? {
    return tempMin
}

fun setTempMin(tempMinn: String) {
    tempMin = tempMinn
}

fun getTempMax(): String? {
    return tempMax
}

fun setTempMax(tempMaxx: String) {
    tempMax = tempMaxx
}

fun getPressure(): String? {
    return pressure
}

fun setPressure(pressuree: String) {
    pressure = pressuree
}

fun getHumidity(): String? {
    return humidity
}

fun setHumidity(humidityy: String) {
    humidity = humidityy
}

fun getSeaLevel(): String? {
    return seaLevel
}

fun setSeaLevel(seaLevell: String) {
    seaLevel = seaLevell
}

fun getGrndLevel(): String? {
    return grndLevel
}

fun setGrndLevel(grndLevell: String) {
    grndLevel = grndLevell
}

}