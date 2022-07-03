package com.chlqudco.develop.carretmarket.presentation.chat

import androidx.lifecycle.viewModelScope
import com.chlqudco.develop.carretmarket.presentation.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

internal class ChatListViewModel : BaseViewModel() {
    override fun fetchData(): Job = viewModelScope.launch {  }
}