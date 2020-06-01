package com.example.recyclerviewdemo.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



class Wind {

    @SerializedName("id")
    @Expose
    private var id: String? = null
    @SerializedName("main")
    @Expose
    private var main: String? = null
    @SerializedName("description")
    @Expose
    private var description: String? = null
    @SerializedName("icon")
    @Expose
    private var icon: String? = null

    fun getId(): String? {
        return id
    }

    fun setId(id: String) {
        this.id = id
    }

    fun getMain(): String? {
        return main
    }

    fun setMain(main: String) {
        this.main = main
    }

    fun getDescription(): String? {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun getIcon(): String? {
        return icon
    }

    fun setIcon(icon: String) {
        this.icon = icon
    }
}