package fundamentos.classe
var desconto: Double = 0.0 // variável static top level (e acessível dentro deste nível do package por todas as classes)

class VariavelStaticTopLevel(val nome: String, var preco: Double) {

    companion object{
        fun create(nome: String, preco: Double) = VariavelDeClasseStatic(nome, preco)
    }

    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}

fun main() {
    val item1: VariavelDeClasseStatic = VariavelStaticTopLevel.create("TV 50 polegadas", 2989.90)
    val item2: VariavelStaticTopLevel = VariavelStaticTopLevel("Liquidificador", 200.0)

    desconto = 0.10 // variável static top level: é aplicado a todos os objetos porque é uma variável de classe e não de instancia (objeto)

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}