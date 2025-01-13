package fundamentos.basico

fun imprimirConceito(x: Any){
    when(x as Int){ // todo: cast: as
        10, 9 -> println("$x Excelente")
        in 6..8 -> println("$x Passou")
        else -> println("$x Reprovado")
    }
}

fun main() {

    val notas = arrayOf(7, 10.0, 4, 0, 6)

    for (i in notas){
        imprimirConceito(i.toInt())
    }
}