package fundamentos.estruturaDeDados

fun main() {
    val numeros: ArrayList<Int> = arrayListOf<Int>(1, 2, 3, 4, 5)
    val texto: ArrayList<String> = arrayListOf<String>("Igor", "Laura")

    println(numeros + texto) // !todo: sobrecarga de tipos de dados diferentes
}