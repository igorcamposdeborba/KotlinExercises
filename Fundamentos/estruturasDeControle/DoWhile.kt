package fundamentos.estruturasDeControle

fun main() {
    var opcao : Int = 0
    do {
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Voce escolheu a opcao ${opcao}")
    } while (opcao != -1)


}