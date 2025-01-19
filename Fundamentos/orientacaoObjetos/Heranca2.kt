package fundamentos.orientacaoObjetos

open class Animal(val nome: String){
    fun emitirSom(): String {
        return "Grrr"
    }
}

class Cachorro : Animal {
    private val altura: Double

    constructor(nome: String, altura: Double): super(nome) { // todo: super chama o construtor da super classe da herança (Animal)
        this.altura = altura
        println(nome + ": " + super.emitirSom())
    }

    constructor(nome: String): this(nome, 0.0) // subclasse chama o construtor acima com this

    override fun toString(): String = "${nome} tem $altura cm de altura"
}

fun main() {
    val dogAlemao = Cachorro("Rex", 84.3)
    val yorkShire = Cachorro("Floquinho")

    println(dogAlemao)
    println(yorkShire)

}