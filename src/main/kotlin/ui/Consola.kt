package org.example.ui

import org.example.modelo.Calculadora
import java.util.Scanner

class Consola(private val calculadora : Calculadora) {
    private var sc = Scanner(System.`in`)

    fun pedirNumero(): Int {
        var respuesta : String

        do{
            mostrar("Introduce un numero: ")
            respuesta = sc.nextLine()

            if(respuesta.toIntOrNull() == null){
                mostrar("Porfavor,introduce un numero")
            }
        }while(respuesta.toIntOrNull() != null)

        return respuesta.toInt()
    }

    fun pedirOperacion(): Int {
        var respuesta : String

        do{
            mostrar("Introduce la operacion que desea realizar ('+','-','*','/') ")
            respuesta = sc.next()

            if(respuesta.toIntOrNull() == null){
                mostrar("Porfavor,introduce un numero")
            }
        }while(respuesta.toIntOrNull() != null)

        return respuesta.toInt()
    }

    fun mostrar(mensaje : String){
        println(mensaje)
    }

    fun menu(){
        mostrar("Calculadora")

    }


}