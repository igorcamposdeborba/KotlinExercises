package fundamentos.estruturasDeControle

fun main() {
    for (i in 1..10) { // .. rangeTo
        println(i)
    }
    println()

    for (i in 10 downTo 1) { // downTo: decrescente
        println(i)
    }
    println()

    for (i in 0..100 step 5) { // step: pular itens
        println(i)
    }

    val lista: ArrayList<String> = arrayListOf<String>("Igor", "Roberto", "Luiza") // For em Lista: índice e valor
    for ((indice, valor) in lista.withIndex()){ // withIndex retorna um objeto para o destructuring (index, valor) pegar os valores desse objeto
        println("${indice} - ${valor}")
    }
}