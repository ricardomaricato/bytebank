fun main() {
    println("Bem vindo ao bytebank")
    var i = 0

    while (i < 5) {

        val titular: String = "Ricardo $i"
        val numeroConta: Int = 8020 + i
        var saldo = i + 10.0

        println("Titular: $titular")
        println("Número da Conta: $numeroConta")
        println("Saldo: $saldo")
        println(i)
        i++

        when {
            saldo > 0.0 -> println("Conta é positiva")
            saldo == 0.0 -> println("Conta é neutra")
            else -> println("Conta é negativa")
        }

    }
//    testaCondicoes(saldo)
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("Conta é positiva")
    } else if (saldo == 0.0) {
        println("Conta é neutra")
    } else {
        println("Conta é negativa")
    }
}