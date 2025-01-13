package fundamentos.funcao

class Teste (var nome: String) { // construtor principal

    var idade: Int = 0;

    constructor(nome: String, idade: Int): this(nome){
        this.idade = idade
    }


    override fun toString(): String{
        return "$nome $idade"
    }
}

fun main() {
    var pessoa: Teste = Teste("Igor")
    println(pessoa)
}