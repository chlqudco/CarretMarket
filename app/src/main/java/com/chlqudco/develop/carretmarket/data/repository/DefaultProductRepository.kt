package com.chlqudco.develop.carretmarket.data.repository

import com.chlqudco.develop.carretmarket.data.entity.product.ProductEntity
import com.chlqudco.develop.carretmarket.data.network.ProductApiService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext

class DefaultProductRepository(
    private val productApi: ProductApiService,
    private val ioDispatcher: CoroutineDispatcher
): ProductRepository {

    //알아서 IO 디스패쳐에서 돌아감, 위드컨텍스트 했으니
    override suspend fun getProductList(): List<ProductEntity> = withContext(ioDispatcher) {
        //getProducts 실행 후 결과값 받아오기
        val response = productApi.getProducts()
        //결과값 반환해주기기
       return@withContext if (response.isSuccessful){
            response.body()?.items?.map { it.toEntity() } ?: listOf()
        }else{
            listOf()
        }
    }

    override suspend fun getProductItem(id: Long): ProductEntity {
        TODO("Not yet implemented")
    }
}