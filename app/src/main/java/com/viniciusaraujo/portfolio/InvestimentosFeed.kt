package com.viniciusaraujo.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InvestimentosFeed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_investimentos_feed)
        supportActionBar?.hide()
    }
}