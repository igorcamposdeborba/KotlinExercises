package fundamentos.estruturaDeDados

fun main() {
    val numeros: Array<Int> = Array<Int>(5) { i -> i * 10 }

    numeros.forEach { println(it) }
    println()

    println(numeros.get(1)) // obter valores
    println(numeros[1])
    println()

    numeros.set(1, 1234) // alterar valores
    numeros[2] = 987
    for (i in numeros){
        println(i)
    }
}