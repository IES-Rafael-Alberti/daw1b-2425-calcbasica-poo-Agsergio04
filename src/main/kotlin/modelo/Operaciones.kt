package org.example.modelo

interface Operaciones {
    fun sumar(primerNumero : Int,segundoNumero : Int) : Int
    fun restar(primerNumero : Int,segundoNumero : Int): Int
    fun dividir(primerNumero : Int,segundoNumero : Int): Int?
    fun comprobarDivision(primerNumero : Int,segundoNumero : Int): Boolean
    fun multiplicar(primerNumero : Int,segundoNumero : Int): Int
}