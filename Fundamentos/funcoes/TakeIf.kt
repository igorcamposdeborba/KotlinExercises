package fundamentos.funcoes

fun main() {
    println("Digite sua mensagem:")

    val entrada : String? = readLine()
    val mensagem: String = entrada.takeIf { it?.trim() != "" }?: "Sem mensagem"

    println(mensagem)
}