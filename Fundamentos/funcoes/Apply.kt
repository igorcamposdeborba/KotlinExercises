package fundamentos.funcoes

class Calculadora2 {
    var resultado = 0

    fun soma(valor1: Int, valor2: Int) {
        resultado += valor1 + valor2
    }
    fun add (valor: Int){
        resultado += valor
    }
    fun reset(): Unit {
        resultado = 0
    }
}

fun main() {
    val calculadora: Calculadora2 = Calculadora2()
    calculadora.apply{ soma(4, 2) }.apply { add(4) }.apply { println(resultado) }.apply { reset() }

    calculadora.apply { soma(4, 2)
                                      add(4)
                                      println(resultado)
                                      reset()
    }

    // inline function
    with (calculadora){
        soma(4, 2)
        add(4)
        println(this.resultado)
        reset()
    }
}