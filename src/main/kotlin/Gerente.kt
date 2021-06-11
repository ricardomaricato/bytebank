class Gerente(
    val senha: Int,
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            return salario * 0.1
        }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}