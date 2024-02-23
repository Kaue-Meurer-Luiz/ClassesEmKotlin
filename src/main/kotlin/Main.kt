import model.Funcionario
import model.Pessoa
import java.time.LocalDate

fun main(args: Array<String>) {

    val pessoa = Pessoa()
    pessoa.nome = "Maria"
    pessoa.peso = 68
    pessoa.exibirDados()

    var funcionario = Funcionario()
    funcionario.nome ="Kaue"
    funcionario.peso = 86
    funcionario.altura = 1.85
    funcionario.cargo = "Gerente"
    funcionario.salario = 7500.50

    funcionario.exibirDados()
}