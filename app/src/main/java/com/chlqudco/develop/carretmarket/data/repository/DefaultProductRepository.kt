package com.chlqudco.develop.carretmarket.data.repository

import com.chlqudco.develop.carretmarket.data.entity.product.ProductEntity
import com.chlqudco.develop.carretmarket.data.network.ProductApiService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class DefaultProductRepository(
    private val productApi: ProductApiService,
    private val idDispatcher: CoroutineDispatcher
): ProductRepository {
    override suspend fun getProductList(): List<ProductEntity> = withContext(idDispatcher) {
        TODO("Not yet implemented")
    }

    override suspend fun getProductItem(id: Long): ProductEntity {
        TODO("Not yet implemented")
    }
}