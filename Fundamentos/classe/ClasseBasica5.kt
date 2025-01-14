package fundamentos.classe

// Mais usado
class ClasseBasicaE(val nome: String, val anoLancamento: Int, val genero: String) {
}

fun main() {
    val filme : ClasseBasicaE = ClasseBasicaE("Monstros S.A.", 2001, "Comedia")
    println("${filme.nome} foi lancado em ${filme.anoLancamento} como genero ${filme.genero}")
}