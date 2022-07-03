package com.chlqudco.develop.carretmarket.data.repository

import com.chlqudco.develop.carretmarket.data.entity.product.ProductEntity

interface ProductRepository {

    suspend fun getProductList(): List<ProductEntity>

    suspend fun getProductItem(id: Long) : ProductEntity
}