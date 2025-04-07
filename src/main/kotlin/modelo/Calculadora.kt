package org.example.modelo

class Calculadora : Operaciones {
    var tipoOperacion = TipoOperacion.MULTIPLICACION

    fun hacerOperacion(primerNumero : Int,segundoNumero : Int,operacion : TipoOperacion): Int? {
        return when(operacion){
            TipoOperacion.RESTA -> restar(primerNumero,segundoNumero)
            TipoOperacion.DIVISION -> dividir(primerNumero,segundoNumero)
            TipoOperacion.SUMA -> sumar(primerNumero,segundoNumero)
            TipoOperacion.MULTIPLICACION -> multiplicar(primerNumero,segundoNumero)
            TipoOperacion.NINGUNO -> null
        }
    }

    override fun sumar(primerNumero: Int, segundoNumero: Int): Int {
        return primerNumero + segundoNumero
    }

    override fun restar(primerNumero: Int, segundoNumero: Int): Int {
        return primerNumero - segundoNumero
    }

    override fun dividir(primerNumero: Int, segundoNumero: Int): Int? {
        return if(comprobarDivision(primerNumero,segundoNumero)){
            primerNumero/segundoNumero
        } else {
            null
        }
    }

    override fun comprobarDivision(primerNumero : Int,segundoNumero : Int) : Boolean{
        return primerNumero >= segundoNumero
    }

    override fun multiplicar(primerNumero: Int, segundoNumero: Int): Int {
        return primerNumero * segundoNumero
    }


}