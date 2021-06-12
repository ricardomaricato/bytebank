fun main() {
    println("Bem vindo ao Bytebank")

    val alex = Funcionario(
        nome = "Alex",
        cpf = "111.111.111-11",
        salario = 1000.0)
    val contaCorrente = ContaCorrente(
        titular = "Alex",
        numero = 1000
    )

    println("nome ${alex.nome}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salario}")
    println("bonificação ${alex.bonificacao}")

    val fran = Gerente(
        nome = "Fran",
        cpf = "222.222.222-22",
        salario = 2000.0,
        senha = 1234)
    val contaPoupanca = ContaPoupanca(
        titular = "Fran",
        numero = 1001
    )

    println("nome ${fran.nome}")
    println("cpf ${fran.cpf}")
    println("salario ${fran.salario}")
    println("bonificação ${fran.bonificacao}")
    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    if(fran.autentica(1234)){
        println("autenticou com sucesso")
    } else {
        println("falha na autentição")
    }
    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupança: ${contaPoupanca.saldo}")

    val gui = Diretor(
        nome = "Gui",
        cpf = "333.333.333-33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )
    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("nome ${gui.nome}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salario}")
    println("bonificação ${gui.bonificacao}")
    println("plr ${gui.plr}")
    println("saldo após saque corrente: ${contaCorrente.saldo}")
    println("saldo após saque poupança: ${contaPoupanca.saldo}")

//    if(gui.autentica(4000)){
//        println("autenticou com sucesso")
//    } else {
//        println("falha na autentição")
//    }
    contaCorrente.transfere(100.0, contaPoupanca)

//    val maria = Analista(
//        nome = "Maria",
//        cpf = "444.444.444-44",
//        salario = 3000.0
//    )
    println("saldo corrente após tranferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupança após receber transferência: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(200.0, contaCorrente)

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(alex)
    calculadora.registra(fran)
    calculadora.registra(gui)
//    calculadora.registra(maria)
    println("saldo poupança após tranferir para corrente: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferência: ${contaCorrente.saldo}")

    println("total de bonificação: ${calculadora.total}")
}

