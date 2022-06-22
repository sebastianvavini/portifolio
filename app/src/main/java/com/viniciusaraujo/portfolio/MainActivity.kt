package com.viniciusaraujo.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }

    private fun listaInvestimentos(){

       /**
        *  investimentos = listOf<Investimento>(
            Investimento(),Investimento(),Investimento()
        )
        **/
    }
}