package com.chlqudco.develop.carretmarket.di

import com.chlqudco.develop.carretmarket.data.network.buildOkHttpClient
import com.chlqudco.develop.carretmarket.data.network.provideGsonConverterFactory
import com.chlqudco.develop.carretmarket.data.network.provideProductApiService
import com.chlqudco.develop.carretmarket.data.network.provideProductRetrofit
import com.chlqudco.develop.carretmarket.data.repository.DefaultProductRepository
import com.chlqudco.develop.carretmarket.data.repository.ProductRepository
import com.chlqudco.develop.carretmarket.domain.GetProductItemUseCase
import com.chlqudco.develop.carretmarket.presentation.chat.ChatListViewModel
import com.chlqudco.develop.carretmarket.presentation.list.ItemListViewModel
import com.chlqudco.develop.carretmarket.presentation.main.MainViewModel
import com.chlqudco.develop.carretmarket.presentation.mypage.MyPageViewModel
import kotlinx.coroutines.Dispatchers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    //뷰모델
    viewModel { MainViewModel() }
    viewModel { ChatListViewModel() }
    viewModel { ItemListViewModel() }
    viewModel { MyPageViewModel() }

    //유스케이스
    factory { GetProductItemUseCase(get()) }

    //코루틴 디스패처
    single { Dispatchers.IO }
    single { Dispatchers.Main }

    //레포
    single<ProductRepository> { DefaultProductRepository(get(),get()) }

    //레트로핏
    single { provideGsonConverterFactory() }
    single { buildOkHttpClient() }
    single { provideProductRetrofit(get(),get()) }
    single { provideProductApiService(get()) }

}