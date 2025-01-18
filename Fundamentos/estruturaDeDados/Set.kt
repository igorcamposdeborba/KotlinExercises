package fundamentos.estruturaDeDados
fun Any.print() = println(this)

fun main() {

    val conjunto1 = hashSetOf<String>("ABC", "DEF", "GHI")
    val conjunto2 = hashSetOf(10, 5, 4, 8, "GHI")

    println(conjunto1.find { it -> it.contains("DEF") })

    println(conjunto1 + conjunto2) // sobrecarga de operadores: junta tipos de dados diferentes no kotlin, mas no Java não existe isso
                                   // união de conjuntos

    conjunto1.intersect(conjunto2).print() // intersecção: pegar elemento em comum nos dois conjuntos. Gera um novo conjunto (não altera conjunto original)
    conjunto1.retainAll(conjunto2).print() // intersecção: mas altera o conjunto original

    (conjunto1 - conjunto2).print() // diferenca: remove o valor em comum entre conjuntos

    val nums = setOf<Int>(1, 2 ,3) // operação somente leitura, nao pode alterar

    conjunto2.clear()
    println(conjunto2)
    conjunto2.isEmpty().print()

}