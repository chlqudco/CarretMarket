package com.chlqudco.develop.carretmarket.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chlqudco.develop.carretmarket.domain.GetProductListUseCase
import com.chlqudco.develop.carretmarket.presentation.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

internal class ItemListViewModel(
    private val getProductListUseCase: GetProductListUseCase
) : BaseViewModel() {

    //라이브 데이터 이용
    private val _productListStateLiveData = MutableLiveData<ItemListState>(ItemListState.UnInitialized)
    val productListStateLiveData: LiveData<ItemListState> = _productListStateLiveData


   override fun fetchData(): Job = viewModelScope.launch {
       /*
       //처음엔 로딩
       setState(ItemListState.Loading)
       //그 뒤엔 성공
       setState(ItemListState.Success(getProductListUseCase()))

        */
    }

    private fun setState(state: ItemListState){
        _productListStateLiveData.postValue(state)
    }
}