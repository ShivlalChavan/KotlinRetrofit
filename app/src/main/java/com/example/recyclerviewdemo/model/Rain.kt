package com.example.recyclerviewdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Rain {

    @SerializedName("1h")
    @Expose
    private var _1h: String? = null

    fun get1h(): String? {
        return _1h
    }

    fun set1h(_1h: String) {
        this._1h = _1h
    }

}