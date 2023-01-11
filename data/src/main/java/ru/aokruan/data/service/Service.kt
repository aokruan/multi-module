package ru.aokruan.data.service

import retrofit2.Response
import retrofit2.http.GET
import ru.aokruan.data.dto.CatDto

interface Service {
    @GET("/cats/")
    fun getAllCats(): Response<List<CatDto>>
}