package fundamentos.estruturasDeControle

fun main() {
    val nota: Int = 5

    // switch
    when (nota){
        9, 10 -> println("Fantastico")
        6, 7, 8 -> println("Bom")
        in 0..5 -> print("Reprovado") // range
        else -> println("nota invalida") // else
    }
}