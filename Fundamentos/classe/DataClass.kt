package fundamentos.classe

import javax.xml.crypto.Data

// data class é o Record do java
data class DataClass (val marca: String, val polegadas: Int){
}

class Geladeira(val marca: String, val litros: Int){
}

fun main() {
    val tv1 : DataClass = DataClass("Samsung", 32)
    val tv2 : DataClass = DataClass("Samsung", 32)

    println(tv1 == tv2) // compara todos os atributos do dataclass
    println(tv1 === tv2) // compara valor e referencia de memória
    println(tv1.toString())
    println(tv1.copy(polegadas = 42))
    println(tv1)

    val (marca, pol) = tv1 // destructuring em data class
    println("${marca}, $pol polegadas")

    val geladeira1: Geladeira = Geladeira("Brastemp", 320)
    val geladeira2: Geladeira = Geladeira("Brastemp", 320)

    println(geladeira1 == geladeira2) // == é equals (compara endereços de memória diferentes dos objetos)
    println(geladeira1.toString())
}