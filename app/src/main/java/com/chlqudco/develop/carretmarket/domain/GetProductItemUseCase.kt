package com.chlqudco.develop.carretmarket.domain

import com.chlqudco.develop.carretmarket.data.entity.product.ProductEntity
import com.chlqudco.develop.carretmarket.data.repository.ProductRepository

internal class GetProductItemUseCase(
    private val productRepository: ProductRepository
) : UseCase{

    //호출 시점에 이 함수가 작동 하는듯?
    suspend operator fun invoke(productId: Long): ProductEntity?{
        return productRepository.getProductItem(productId)
    }
}