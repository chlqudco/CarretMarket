package com.chlqudco.develop.carretmarket.presentation.list

import com.chlqudco.develop.carretmarket.data.entity.product.ProductEntity

//아이템 목록의 상태값 표현
sealed class ItemListState {

    object UnInitialized: ItemListState()

    object Loading: ItemListState()

    data class Success(
        val productList: List<ProductEntity>
    ): ItemListState()

    object Error: ItemListState()
}