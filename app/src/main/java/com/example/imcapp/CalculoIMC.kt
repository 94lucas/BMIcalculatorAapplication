package com.example.imcapp

import kotlin.math.pow

fun calcularIMC(alturaUsuario: Double, pesoUsuario: Double) : Double{
    return pesoUsuario /((alturaUsuario/100).pow(2.0))
}


fun determinarClassificacaoIMC(imc: Double): String {
    return if(imc < 18.5) {
        "Abaixo do peso"
    } else if (imc >= 18.5 && imc < 25.0) {
        "Peso Ideal"
    } else if (imc >= 25.0 && imc < 30.0) {
        "Levemente acima do peso"
    } else if (imc >= 30.0 && imc < 35.0) {
        "Obesidade Grau I"
    } else if (imc >= 35.0 && imc < 40.0) {
        "Obesidade Grau II"
    } else {"Obesidade Grau III"}
}