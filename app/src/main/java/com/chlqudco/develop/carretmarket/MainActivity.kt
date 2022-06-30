package com.chlqudco.develop.carretmarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.chlqudco.develop.carretmarket.databinding.ActivityMainBinding
import com.chlqudco.develop.carretmarket.login.LogInActivity

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        logInCheck()


        //네비그래프 테스트
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.mainNavigationHostFragment) as NavHostFragment
        val navController = navHostFragment.findNavController()
        binding.mainBottomNavigationView.setupWithNavController(navController)
    }

    //로그인이 안되어 있으면 로그인 하러 가기
    private fun logInCheck(){
        val intent = Intent(this,LogInActivity::class.java)
        startActivity(intent)
    }
}