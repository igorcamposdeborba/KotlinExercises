package fundamentos.classe

class ClasseBasicaD {
    val nome: String
    val anoLancamento: Int
    val genero: String

    constructor(nome: String, anoLancamento: Int, genero: String){
        this.nome = nome
        this.anoLancamento = anoLancamento
        this.genero = genero
    }
}

fun main() {
    val filme : ClasseBasicaD = ClasseBasicaD("O Poderoso Chefao", 1972, "Drama")
    println("${filme.nome} foi lancado em ${filme.anoLancamento} como genero ${filme.genero}")
}
