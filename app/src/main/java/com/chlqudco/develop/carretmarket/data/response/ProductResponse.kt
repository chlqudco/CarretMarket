package com.chlqudco.develop.carretmarket.data.response

import com.chlqudco.develop.carretmarket.data.entity.product.ProductEntity
import java.util.*

data class ProductResponse(
    val id : Long,
    val createdAt: Date,
    val productName: String,
    val productPrice: Int,
    val productImage: String,
    val productType: String,
    val productDescription: String
){
    fun toEntity() : ProductEntity =
        ProductEntity(id,createdAt, productName, productPrice, productImage, productType, productDescription)
}