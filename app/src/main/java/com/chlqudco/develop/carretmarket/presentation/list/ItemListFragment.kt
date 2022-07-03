package com.chlqudco.develop.carretmarket.presentation.list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chlqudco.develop.carretmarket.R
import com.chlqudco.develop.carretmarket.databinding.FragmentChatListBinding
import com.chlqudco.develop.carretmarket.databinding.FragmentItemListBinding
import com.chlqudco.develop.carretmarket.presentation.BaseFragment
import org.koin.android.ext.android.inject

internal class ItemListFragment : BaseFragment<ItemListViewModel,FragmentItemListBinding>() {

    override fun getViewBinding(): FragmentItemListBinding = FragmentItemListBinding.inflate(layoutInflater)

    override val viewModel: ItemListViewModel by inject<ItemListViewModel>()

    companion object {
        fun newInstance() = ItemListFragment()
    }

    override fun observeData() {
    }
}