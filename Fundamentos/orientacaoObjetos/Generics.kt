package fundamentos.orientacaoObjetos

class Caixa<T>(val objeto: T) {
    private val objetos = ArrayList<T>()

    init{
        adicionar(objeto)
    }
    fun adicionar (novoObjeto: T) {
        objetos.add(novoObjeto)
    }

    override fun toString(): String = objetos.toString()
}

fun main() {
    val materialEscolar:Caixa<String> = Caixa<String>("Caneta")
    materialEscolar.adicionar("Lapis")
    materialEscolar.adicionar("Caderno")

    println(materialEscolar)

    val numeros: Caixa<Int> = Caixa<Int>(123)
    numeros.adicionar(543)
    numeros.adicionar(654)
    println(numeros)
}