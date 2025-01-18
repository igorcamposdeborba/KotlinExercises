package fundamentos.funcoes

fun main() {
    val nomes: List<String> = arrayListOf<String>("Andre", "Roberto", "Luiza", "Laura")
    val ordenados: List<String> = nomes.sortedBy{ it }.asReversed() // lambda expression {it}

    println(ordenados)

}