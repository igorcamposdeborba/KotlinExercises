package fundamentos.estruturaDeDados

fun main() {

    val matriz: Array<Array<Int?>> = Array(3){ arrayOfNulls<Int>(3) }

    for (i in matriz.indices){
        for (j in matriz[i].indices){
            matriz[i][j] = (i + 1) * (j + 1)
        }
    }

    matriz.forEach { i ->
            i.forEach { j -> println(j)
        }
    }

    for ((linha, linhaArray) in matriz.withIndex()){
        for ((coluna, valor) in linhaArray.withIndex()){
            println("$linha $coluna - ${matriz[linha][coluna]}")
        }
    }
}