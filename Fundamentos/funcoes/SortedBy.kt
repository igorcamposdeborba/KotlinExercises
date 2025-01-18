package fundamentos.funcoes

fun main() {
    val nomes: ArrayList<String> = arrayListOf<String>("Andre", "Roberto", "Luiza", "Laura")
    val ordenados = nomes.sortedBy{ it }.asReversed()

    println(ordenados)

}