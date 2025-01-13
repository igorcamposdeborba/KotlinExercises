package fundamentos.basico

// data class é igual ao Record do java
data class Carro(val marca: String, val modelo: String)

fun main() {
    val(marca, modelo) = Carro("Ford", "Fusion")// destructuring (marca, modelo)
    println("${marca} ${modelo}")

    val(marido, mulher) = listOf<String>("Joao", "Maria")
    println("$marido $mulher")

    val(_, _, terceiro) = listOf("Kimi", "Hamilton", "Alonso") // _ ignora o item do destructuring
    println(terceiro)

    val lista: ArrayList<String> = arrayListOf<String>("Igor", "Roberto", "Luiza")
    for ((indice, valor) in lista.withIndex()){ // withIndex retorna um objeto para o destructuring (index, valor) pegar os valores desse objeto
        println("${indice} - ${valor}")
    }
}