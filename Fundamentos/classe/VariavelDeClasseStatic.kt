package fundamentos.classe

class VariavelDeClasseStatic (val nome: String, var preco: Double) {

    companion object{
        fun create(nome: String, preco: Double) = VariavelDeClasseStatic(nome, preco)
        @JvmStatic
        var desconto: Double = 0.0
    }

    fun precoComDesconto(): Double{
        return preco - preco * desconto
    }
}

fun main() {
    val item1: VariavelDeClasseStatic = VariavelDeClasseStatic.create("TV 50 polegadas", 2989.90)
    val item2: VariavelDeClasseStatic = VariavelDeClasseStatic("Liquidificador", 200.0)

    VariavelDeClasseStatic.desconto = 0.10 // variável static: é aplicado a todos os objetos porque é uma variável de classe e não de instancia (objeto)

    println(item1.precoComDesconto())
    println(item2.precoComDesconto())
}