package org.example.ui

import org.example.modelo.Calculadora
import org.example.modelo.TipoOperacion
import java.util.Scanner

class Consola(private val calculadora: Calculadora) {

    private var sc = Scanner(System.`in`)

    fun pedirNumero(): Int {
        var respuesta: String

        do {
            mostrar("Introduce un numero: ")
            respuesta = sc.nextLine()

            if (respuesta.toIntOrNull() == null) {
                mostrar("Por favor, introduce un numero valido")
            }
        } while (respuesta.toIntOrNull() == null)

        return respuesta.toInt()
    }

    fun pedirOperacion(): TipoOperacion {
        var respuesta: String
        var tipo: TipoOperacion

        do {
            mostrar("Introduce la operacion que desea realizar ('+','-','*','/'): ")
            respuesta = sc.nextLine()
            tipo = TipoOperacion.getOperacion(respuesta)

            if (tipo == TipoOperacion.NINGUNO) {
                mostrar("Por favor, introduce una operación valida")
            } else {
                calculadora.tipoOperacion = tipo
            }
        } while (tipo == TipoOperacion.NINGUNO)

        return tipo
    }

    fun deseaSalir(): Boolean {
        var respuesta: String

        do {
            mostrar("¿Deseas salir? (s/n): ")
            respuesta = sc.nextLine().trim().lowercase()

            if (respuesta !in listOf("s", "n")) {
                mostrar("Por favor, responde con 's' o 'n'")
            }
        } while (respuesta !in listOf("s", "n"))

        return respuesta == "s"
    }

    fun mostrar(mensaje: String) {
        println(mensaje)
    }

    fun menu() {
        do {
            mostrar("----------Calculadora-----------")
            mostrar("Primer numero: ")
            val numero1 = pedirNumero()
            mostrar("Segundo numero: ")
            val numero2 = pedirNumero()
            val operacion = pedirOperacion()
            val resultado = calculadora.hacerOperacion(numero1, numero2, operacion)

            if (resultado == null) {
                mostrar("No se ha podido realizar la operacion")
            } else {
                mostrar("$resultado")
            }
        } while (!deseaSalir())
    }
}
