package com.chlqudco.develop.carretmarket.domain

import com.chlqudco.develop.carretmarket.data.entity.product.ProductEntity
import com.chlqudco.develop.carretmarket.data.repository.ProductRepository

//전체 아이템을 가져오는 유스케이스
internal class GetProductListUseCase(
    private val productRepository: ProductRepository
) : UseCase{

    //호출 시점에 이 함수가 작동 하는듯?
    suspend operator fun invoke(): List<ProductEntity>{
        return productRepository.getProductList()
    }
}