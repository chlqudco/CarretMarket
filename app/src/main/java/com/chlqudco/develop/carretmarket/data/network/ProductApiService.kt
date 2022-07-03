package com.chlqudco.develop.carretmarket.data.network

import com.chlqudco.develop.carretmarket.data.response.ProductResponse
import com.chlqudco.develop.carretmarket.data.response.ProductsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApiService {

    @GET("제품전체")
    suspend fun getProducts(): Response<ProductsResponse>

    @GET("제품이름/{productId}")
    suspend fun getProduct(@Path("pro") productId: Long): Response<ProductResponse>

}