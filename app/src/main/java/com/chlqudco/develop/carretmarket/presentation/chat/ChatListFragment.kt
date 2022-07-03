package com.chlqudco.develop.carretmarket.presentation.chat

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chlqudco.develop.carretmarket.R
import com.chlqudco.develop.carretmarket.databinding.FragmentChatListBinding
import com.chlqudco.develop.carretmarket.presentation.BaseFragment
import org.koin.android.ext.android.inject

internal class ChatListFragment : BaseFragment<ChatListViewModel,FragmentChatListBinding>() {

    override val viewModel: ChatListViewModel by inject<ChatListViewModel>()

    override fun getViewBinding(): FragmentChatListBinding = FragmentChatListBinding.inflate(layoutInflater)

    override fun observeData() {
    }

    companion object {
        fun newInstance() = ChatListFragment()
    }
}