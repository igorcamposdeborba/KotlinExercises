package fundamentos.estruturaDeDados

fun main() {

    val alunos : ArrayList<String> = arrayListOf("Igor", "Roberto", "Laura")

    for ((indice, aluno) in alunos.withIndex()){ // destructuring E precisa indexar com withIndex
        println("${indice} - $aluno")
    }

    alunos.forEach({ println(it) })
}