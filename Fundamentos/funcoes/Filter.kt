package fundamentos.funcoes

data class Aluno (val nome: String, val nota: Double)

fun main() {
    val alunos: List<Aluno> = arrayListOf(Aluno("Igor", 10.0),
                                          Aluno("Pedro", 4.0),
                                          Aluno("Ana", 8.5))

    val aprovados: List<Aluno> = alunos.filter{it.nota >= 7.0}.sortedBy { it.nome }
    println(aprovados)
}