package com.viniciusaraujo.portfolio

import kotlin.Double as Double

class Investimento {

    private var nome:String=""
    private var acumulado: Double=0.0
    private var liquido:Double=0.0
    private var precoDeCompra:Double=0.00
    private var precoDeVenda:Double=0.0
    private var lucro:Double=0.0
    private var pontos:Double=0.0
    private var milhas:Double=0.0
    private var diasDeTrabalho:Double=0.0
    private var horasDeTrabalho:Double=0.0
    private var precoDaHora:Double=0.0

    fun setNome(novo:String){
        this.nome=novo
    }
    fun setAcumulado(valor:Double){
        this.acumulado=valor
    }
    fun setLiquido(vl:Double){
        this.liquido=vl
    }
    fun setPrecoDeCompra(novo:Double){
        this.precoDeCompra=novo
    }
    fun setPrecoDeVenda(novoValor:Double){
        this.precoDeVenda=novoValor
    }
    fun setLucro(a:Double){
        this.lucro=a
    }
    fun setPontos(novos:Double){
        this.pontos=novos
    }
    fun setMilhas(milhas:Double){
        this.milhas=milhas
    }
    fun setDiasDeTrabalho(dias:Double){
        this.diasDeTrabalho=dias
    }
    fun setHorasDeTrabalho(h:Double){
        this.horasDeTrabalho=h
    }
    fun setPrecoDaHora(preco:Double){
        this.precoDaHora=preco
    }
}