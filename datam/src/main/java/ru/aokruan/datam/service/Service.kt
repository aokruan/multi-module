package ru.aokruan.datam.service

import retrofit2.Response
import retrofit2.http.GET
import ru.aokruan.datam.dto.CatDto

interface Service {
    @GET("/cats/")
    fun getAllCats(): Response<List<CatDto>>
}