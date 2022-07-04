package com.chlqudco.develop.carretmarket.presentation.list

import androidx.core.view.isGone
import com.chlqudco.develop.carretmarket.databinding.FragmentItemListBinding
import com.chlqudco.develop.carretmarket.presentation.BaseFragment
import com.chlqudco.develop.carretmarket.presentation.adapter.ProductListAdapter
import org.koin.android.ext.android.inject

internal class ItemListFragment : BaseFragment<ItemListViewModel,FragmentItemListBinding>() {

    override fun getViewBinding(): FragmentItemListBinding = FragmentItemListBinding.inflate(layoutInflater)

    override val viewModel: ItemListViewModel by inject<ItemListViewModel>()

    private val adapter = ProductListAdapter()

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
        //어뎁터 연결
        //itemListRecyclerView.adapter = adapter
        //새로 고침 가능하도록 리프레ㅣ 레이아웃 구현
        //itemSwipeRefreshLayout.setOnRefreshListener {
        //    viewModel.fetchData()
        //}
    }

    private fun handleLoadingState() = with(binding){
        itemSwipeRefreshLayout.isRefreshing = true
    }


    private fun handleSuccessState(state: ItemListState.Success) = with(binding){
        itemSwipeRefreshLayout.isRefreshing = false

        if (state.productList.isEmpty()){
            //비어있을 때의 그.. 텍스트뷰 띄우기?

            itemListRecyclerView.isGone = true
        }else{
            itemListRecyclerView.isGone = false
            adapter.setProductList(state.productList){
                //클릭 리스너는 나중에~
            }
        }
    }

    private fun handleErrorState(){
        //토스트
    }
}