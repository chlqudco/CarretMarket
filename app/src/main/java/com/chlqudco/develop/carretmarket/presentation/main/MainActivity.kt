package com.chlqudco.develop.carretmarket.presentation.main

import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.chlqudco.develop.carretmarket.R
import com.chlqudco.develop.carretmarket.databinding.ActivityMainBinding
import com.chlqudco.develop.carretmarket.login.LogInActivity
import com.chlqudco.develop.carretmarket.presentation.BaseActivity
import org.koin.android.ext.android.inject

internal class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override val viewModel by inject<MainViewModel>()

    override fun getViewBinding() = ActivityMainBinding.inflate(layoutInflater)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        logInCheck()
        initViews()
    }

    //네비그래프와 바텀네비 연결
    private fun initViews(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainNavigationHostFragment) as NavHostFragment
        val navController = navHostFragment.findNavController()
        binding.mainBottomNavigationView.setupWithNavController(navController)
    }

    //로그인이 안되어 있으면 로그인 하러 가기
    private fun logInCheck(){
        val intent = Intent(this,LogInActivity::class.java)
        startActivity(intent)
    }

    override fun observeData() {
    }
}