package com.chlqudco.develop.carretmarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chlqudco.develop.carretmarket.login.LogInActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        logInCheck()

    }

    //로그인이 안되어 있으면 로그인 하러 가기
    private fun logInCheck(){
        val intent = Intent(this,LogInActivity::class.java)
        startActivity(intent)
    }
}