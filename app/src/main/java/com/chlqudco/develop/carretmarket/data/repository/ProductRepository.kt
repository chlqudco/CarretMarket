package com.chlqudco.develop.carretmarket.data.repository

import com.chlqudco.develop.carretmarket.data.entity.product.ProductEntity

interface ProductRepository {

    //전체 아이템 가져오기
    suspend fun getProductList(): List<ProductEntity>

    //id로 특정 아이템 가져오기
    suspend fun getProductItem(id: Long) : ProductEntity
}