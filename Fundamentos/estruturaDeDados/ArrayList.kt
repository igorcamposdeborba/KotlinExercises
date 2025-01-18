package fundamentos.estruturaDeDados

fun main() {
    val pares :ArrayList<Int> = arrayListOf(2, 4, 6)
    val impares = intArrayOf(1, 3, 5) // intArray

    impares.union(pares).sorted().forEach{println(it)}

    // tipos de dados misturados
    val listaMix = arrayListOf("Igor", 10, true, 'A')

    listaMix.forEach { i -> when(i) {
            is String -> println(i.uppercase())
            is Number -> println(i.toDouble() * 1)
            is Boolean -> println(i)
            is Char -> println(i.lowercaseChar())
        }

    }

    // MutableList é a classe abstrata de ArrayList de objetos
    var frutas : MutableList<Fruta> = arrayListOf<Fruta>(Fruta("Banana", 1.50), Fruta("Morango", 1.50))
    frutas.forEach{
        println("${it.nome} - R$ %.2f".format(it.preco))
    }

    println(frutas.contains(Fruta("Banana", 1.50))) // equals pré-implementado no data class para comparar por valor, mesmo sendo objetos com endereços de memória diferentes

    println(frutas.distinctBy { it.preco })
    frutas.add(Fruta("Melancia", 3.0))
    println(frutas)
    frutas.shuffle()
    println(frutas)
}

// igual ao Record do java. data class implementa equals and hashcode para comparar pelo valor e atribuir um id de comparacao
data class Fruta (var nome: String, var preco: Double)


