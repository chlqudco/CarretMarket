package com.chlqudco.develop.carretmarket.presentation.list

import com.chlqudco.develop.carretmarket.databinding.FragmentItemListBinding
import com.chlqudco.develop.carretmarket.presentation.BaseFragment
import org.koin.android.ext.android.inject

internal class ItemListFragment : BaseFragment<ItemListViewModel,FragmentItemListBinding>() {

    override fun getViewBinding(): FragmentItemListBinding = FragmentItemListBinding.inflate(layoutInflater)

    override val viewModel: ItemListViewModel by inject<ItemListViewModel>()

    companion object {
        fun newInstance() = ItemListFragment()
    }

    //라이브 데이터가 바뀜에 따라 행동하는게 다름
    override fun observeData() = viewModel.productListStateLiveData.observe(this){
        when(it){
            is ItemListState.UnInitialized -> {
                initViews(binding)
            }
            is ItemListState.Loading -> {
               // handleLoadingState()
            }
            is ItemListState.Success -> {
               // handleSuccessState(it)
            }
            is ItemListState.Error -> {
               // handleErrorState()
            }
        }
    }

    private fun initViews(binding: FragmentItemListBinding) = with(binding){

    }
}