package fundamentos.orientacaoObjetos

open class Comida(val peso: Double) // herança

class Feijao(peso: Double): Comida (peso)

class Arroz: Comida {
    constructor(peso: Double): super(peso) // chamando super classe da herança
}

class Ovo(peso: Double): Comida(peso)


class Pessoa(var peso: Double){
    fun comer(comida: Comida){ // polimorfismo: Comida que é uma open class (herança) que é chamada via super()
        peso += comida.peso
    }
}

fun main() {
    val feijao: Feijao = Feijao(0.3)
    val arroz: Arroz = Arroz(0.25)
    val ovo: Ovo = Ovo(0.2)

    val igor: Pessoa = Pessoa(63.0)
    igor.comer(feijao)
    igor.comer(arroz)
    igor.comer(ovo)
    println(igor.peso)
}