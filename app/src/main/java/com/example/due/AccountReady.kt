package com.example.due

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager

class AccountReady : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_ready)
    }
}