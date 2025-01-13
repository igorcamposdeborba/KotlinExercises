package fundamentos.funcao

class Operacoes {
    fun somar(a: Int, b: Int) : Int {
        return a + b
    }
}

fun somar(a: Int, b: Int): Int{
    return a + b
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int) : Int { // !todo: funcao como parametro de outra funcao
    return funcao(a, b)
}

fun main() {
    println(calc(2, 3, Operacoes()::somar)) // passando funcao como parametro de outra funcao (de dentro da classe)
    println(calc(2, 3, ::somar)) // funcao como parametro de outra funcao (de fora da classe - funcao top level)
}