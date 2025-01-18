package fundamentos.funcoes

import java.util.Locale

fun main() {
    val alunos: List<String> = arrayListOf("Igor", "Roberto", "Luiza", "Laura")

    alunos.map { it.uppercase(Locale("pt", "BR")) }
                          .apply { print(this) }



}