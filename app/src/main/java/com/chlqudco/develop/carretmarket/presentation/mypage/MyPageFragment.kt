package com.chlqudco.develop.carretmarket.presentation.mypage

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chlqudco.develop.carretmarket.R
import com.chlqudco.develop.carretmarket.databinding.FragmentMyPageBinding
import com.chlqudco.develop.carretmarket.presentation.BaseFragment
import org.koin.android.ext.android.inject

internal class MyPageFragment : BaseFragment<MyPageViewModel,FragmentMyPageBinding>() {

    override val viewModel: MyPageViewModel by inject<MyPageViewModel>()

    override fun getViewBinding(): FragmentMyPageBinding = FragmentMyPageBinding.inflate(layoutInflater)

    override fun observeData() {
    }

    companion object {
        fun newInstance() = MyPageFragment()
    }
}