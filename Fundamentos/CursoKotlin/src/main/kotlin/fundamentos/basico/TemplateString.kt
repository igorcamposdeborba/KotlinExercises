package fundamentos

import kotlin.random.Random

fun main(args : Array<String>) {

    val aprovados : List<String> = listOf<String>("Igor", "Roberto", "Laura")

    // template string
    println("Entre os aprovados $aprovados, o representante foi ${aprovados[Random.nextInt(aprovados.size)]}")

}