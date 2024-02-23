package model

import java.time.LocalDate
import java.time.Period

open class Pessoa {
    //Propriedades/campo/atributo do objeto
    var nome: String = ""
    var dataNascimento: LocalDate = LocalDate.of(2000,5,31)
    var peso: Int = 0
    var altura: Double = 0.0

    val idade: Int
        get() {
            return Period.between(dataNascimento, LocalDate.now()).years
        }


    // Métodos/comportamentos
    open fun exibirDados(){
        println("Nome: $nome")
        println("Peso: $peso")
        println("Altura: $altura")
        println("Data de Nascimento: $dataNascimento")
        println("Idade: $idade")
        println("------------------------------------")
    }

//    fun calcularIdade(): Int{
//        var idade = Period.between(dataNascimento, LocalDate.now()).years
//        return idade
//
//    }

}