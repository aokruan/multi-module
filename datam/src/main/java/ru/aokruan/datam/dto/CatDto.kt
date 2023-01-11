package ru.aokruan.datam.dto

import com.google.gson.annotations.SerializedName
import ru.aokruan.datam.models.Cat

data class CatDto(@SerializedName("name") val name: String) {
    fun toCat(): Cat {
        return Cat(name = this.name)
    }
}