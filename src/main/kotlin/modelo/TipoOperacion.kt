package org.example.modelo

enum class TipoOperacion {
    SUMA,RESTA,MULTIPLICACION,DIVISION,NINGUNO;

    companion object {
        fun getOperacion(operacion : String) : TipoOperacion{
            return when(operacion){
                "-" -> TipoOperacion.RESTA
                "/" -> TipoOperacion.DIVISION
                "*" -> TipoOperacion.MULTIPLICACION
                "+"-> TipoOperacion.SUMA
                else -> TipoOperacion.NINGUNO
            }
        }
    }
}