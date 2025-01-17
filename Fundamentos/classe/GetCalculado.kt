package fundamentos.classe

class GetCalculado(var nome: String, var preco: Double, var desconto: Double, var ativo: Boolean) {

    // atributos com get calculado
    val inativo: Boolean
        get() = !ativo

    internal val precoComDesconto: Double
        get() = preco * (1 - desconto)
}

fun main() {
    val produto1 = GetCalculado("iPad", 2349.90, 0.20, true)
    println(produto1.precoComDesconto)

    val produto2 = GetCalculado("Galaxy", 2699.49, 0.5, false)
    println("${produto2.nome} de: R$ ${produto2.preco} por: R$ ${produto2.precoComDesconto}")

    if (produto2.inativo) {
        produto2.preco = 0.0
        println("Depois de inativo: R$ ${produto2.precoComDesconto}")

    }
}