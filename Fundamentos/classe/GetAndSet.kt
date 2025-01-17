package fundamentos.classe

class GetAndSet {
    private val IDADE_CONST : Int = 0

    // Todos os atributos em Kotlin são public por padrão. Preciso colocar private, protected, internal (no pojeto = módulo)
    var nome: String
        get() = "meu nome eh ${field}" // get associado ao nome
        set(valor: String) {
            field = valor.takeIf {
                valor.isNotEmpty()
            } ?: "Anonimo" // set com valor default se vier null, vazio ou ""
        }

    private var idade: Int? = IDADE_CONST
    val getIdade: Int?
        get() = idade


    constructor(nome: String) {
        this.nome = nome
    }

    constructor(nome: String, idade: Int) {
        this.nome = nome
        this.idade = idade
    }
}

fun main() {
    val c1 = GetAndSet("")
    println(c1.nome)

    val c2 = GetAndSet("Igor")
    println(c2.nome)

    val c3 = GetAndSet("Igor", 30)
    println(c3.getIdade)

    val c4 = GetAndSet("Igor", )
    println(c4.getIdade)
}
