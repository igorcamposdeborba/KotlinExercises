package fundamentos.classe

class ClasseBasicaC {
    private var resultado: Int

    init {
        resultado = limpar()
    }

    fun somar(vararg valores: Int): ClasseBasicaC{
        valores.forEach { resultado += it }
        return this // this: retorna este objeto desta classe
    }
    fun multiplicar (valor: Int): ClasseBasicaC {
        resultado *= valor
        return this
    }
    fun limpar(): Int {
        resultado = 0
        return resultado
    }

    fun print(): ClasseBasicaC {
        println(resultado)
        return this
    }
    fun getResult(): Int{
        return resultado
    }
}

fun main() {
    val calculadora : ClasseBasicaC = ClasseBasicaC()
    calculadora.somar(1, 2, 3).multiplicar(3).print() // encadeamento de métodos

    calculadora.somar(1, 2).print()

    println(calculadora.getResult())
    println(calculadora.limpar())
}