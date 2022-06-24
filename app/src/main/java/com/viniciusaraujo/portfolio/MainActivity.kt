package com.viniciusaraujo.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.viniciusaraujo.portfolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var nome: EditText
    private lateinit var acumulado: EditText
    private lateinit var liquido: EditText
    private lateinit var precoCompra: EditText
    private lateinit var precoVenda: EditText
    private lateinit var lucro: EditText
    private lateinit var pontos: EditText
    private lateinit var milhas: EditText
    private lateinit var horasDeTrabalho: EditText
    private lateinit var diasDeTrabalho:EditText
    private lateinit var precoDaHora:EditText
    private lateinit var trajetoEmKMs: EditText
    private lateinit var kmPorLitro: EditText
    private lateinit var qtdLitros: EditText
    private lateinit var precoPorLitro: EditText
    private lateinit var qtdUnidades: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)

        nome=binding.editTextNome
        acumulado=binding.editTextAcumulado
        liquido=binding.editTextLiquido
        precoCompra=binding.editTextPrecoDeCompra
        precoVenda=binding.editTextPrecoDeVenda
        lucro=binding.editTextLucro
        pontos=binding.editTextPontos
        milhas=binding.editTextMilhas
        horasDeTrabalho=binding.editTextHorasDeTrabalho
        diasDeTrabalho=binding.editTextDiasDeTrabalho
        precoDaHora=binding.editTextPrecoHora
        trajetoEmKMs=binding.editTextTrajetoKms
        kmPorLitro=binding.editTextKmForLiter
        qtdLitros=binding.editTextLitrosComprados
        precoPorLitro=binding.editTextPrecoPorLitro
        qtdUnidades=binding.editTextQtdUnidades


    }

    private fun salvar() {

        var invest = Investimento()
        invest.setNome(nome.toString())
        invest.setAcumulado(acumulado.toString().toDouble())
        invest.setLiquido(liquido.toString().toDouble())
        invest.setPrecoDeCompra(precoCompra.toString().toDouble())
        invest.setPrecoDeVenda(precoVenda.toString().toDouble())
        invest.setLucro(lucro.toString().toDouble())
        invest.setPontos(pontos.toString().toDouble())
        invest.setMilhas(milhas.toString().toDouble())
        invest.setHorasDeTrabalho(horasDeTrabalho.toString().toDouble())
    }
}