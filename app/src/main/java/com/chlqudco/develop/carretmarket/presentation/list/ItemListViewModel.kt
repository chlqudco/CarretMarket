package com.chlqudco.develop.carretmarket.presentation.list

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.chlqudco.develop.carretmarket.presentation.BaseViewModel
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch

internal class ItemListViewModel : BaseViewModel() {
    override fun fetchData(): Job = viewModelScope.launch {  }
}