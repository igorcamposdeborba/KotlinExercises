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

}