fun main() {
    println("Hello World")
    val titular: String = "Ricardo"
    val numeroConta: Int = 8020-9
    var saldo = 0.0
    saldo = 100 + 2.0
    saldo += 200
    saldo -= 1000

    println("Titular: $titular")
    println("Número da Conta: $numeroConta")
    println("Saldo: $saldo")

    when {
        saldo > 0.0 -> println("Conta é positiva")
        saldo == 0.0 -> println("Conta é neutra")
        else -> println("Conta é negativa")
    }
}