package ru.aokruan.data.dto

import com.google.gson.annotations.SerializedName
import ru.aokruan.data.models.Cat

data class CatDto(@SerializedName("name") val name: String) {
    fun toCat(): Cat {
        return Cat(name = this.name)
    }
}