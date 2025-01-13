package fundamentos.funcao

class FuncaoInfix(val nome: String, val preco: Double) {
}

infix fun FuncaoInfix.maisCaroQue(produto : FuncaoInfix): Boolean = this.preco > produto.preco

fun main() {
    val prod1 = FuncaoInfix("Caderno", 23.48)
    val prod2 = FuncaoInfix("Caneta", 4.00)

    println(prod1 maisCaroQue prod2) // todo: infix: criado nome da funcao sem precisar de parenteses
    println(prod1.maisCaroQue(prod2))
}