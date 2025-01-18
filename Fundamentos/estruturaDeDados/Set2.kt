package fundamentos.estruturaDeDados

fun main() {
    val aprovados1 = hashSetOf("Igor", "Roberto", "Luiza", "Laura") // HashSet não mantém a ordem, é baseado numa heashtable

    aprovados1.forEach{ println(it) }

    val aprovados2 = linkedSetOf("Igor", "Roberto", "Luiza", "Laura") // Linked mantém a ordem lincada
    aprovados2.print() // chamando método com override de outro arquivo

    val aprovados3 = sortedSetOf("Igor", "Roberto", "Luiza", "Laura") // Sorted ordena por default
    aprovados3.print()

    aprovados3.sortedBy { it -> it.substring(1) }.print() // Sorted com ordenação personalizada

}