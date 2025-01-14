package fundamentos.classe

class Init(nome: String, anoLancamento : Int, genero: String) {
    val nome : String
    val anoLancamento : Int
    val genero: String

    // Inicializacao (para calculo, validacoes e operacoes complexas)
    init {
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme = Init("Os incriveis", 2004, "Acao")
    println("${filme.nome} foi lancado em ${filme.anoLancamento} como genero ${filme.genero}")
}