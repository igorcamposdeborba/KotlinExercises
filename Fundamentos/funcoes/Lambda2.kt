package fundamentos.funcoes

interface Operacao {
    fun executar(a: Int, b: Int): Int
}

class Multiplicacao: Operacao {
    override fun executar(a: Int, b: Int): Int {
        return a * b
    }
}

class Calculadora {
    fun calcular(a: Int, b: Int): Int {
        return a + b
    }

    fun calcular(a: Int, b: Int, operacao: Operacao): Int {
        return operacao.executar(a, b)
    }

    // todo: funcao lambda (não precisa criar Interface operacao e nem classe Multiplicacao que implementa a operacao)
    fun calcular(a: Int, b: Int, operacao: (Int, Int) -> Int): Int {
        return operacao(a, b)
    }
}

fun main() {
    val calculadora = Calculadora()
    val resultado1 = calculadora.calcular(3, 4)
    val resultado2 = calculadora.calcular(3, 4, Multiplicacao())

    println("Resultado da soma: $resultado1")
    println("Resultado da multiplicacao com interface: $resultado2")

    val subtracao = {a: Int, b: Int -> a - b} // todo: funcao como parametro (com logica interna)

    val resultado3 = calculadora.calcular(3, 4, subtracao)
    println(resultado3)
}