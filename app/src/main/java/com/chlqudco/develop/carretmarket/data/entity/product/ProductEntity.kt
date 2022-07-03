package com.chlqudco.develop.carretmarket.data.entity.product

import java.util.*

//어떻게 받아올지 상의 안함
data class ProductEntity(
    val id : Long,
    val createdAt: Date,
    val productName: String,
    val productPrice: Int,
    val productImage: String,
    val productType: String,
    val productDescription: String
)
