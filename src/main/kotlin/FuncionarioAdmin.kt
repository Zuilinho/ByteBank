import interfaces.Autenticavel

abstract class FuncionarioAdmin(
    id: Int,
    nome: String,
    salario: Double,
    idade: Int,
    val senha: String
): Funcionario(
    id = id,
    nome = nome,
    salario = salario,
    idade = idade
), Autenticavel {

}