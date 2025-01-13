package fundamentos.basico

import java.util.Date

fun main() {
    var a: Int = 7
    var b: Int = 3

    a+= b
    println("Soma: $b")

    a-= b
    println("Subtracao: $b")

    a*= b
    println("Multiplicacao: $b")

    a/= b
    println("Divisao: $a")

    a%= b
    println("Modulo: $a")

    val (v1, v2, v3, v4) = listOf<Int>(3, 5, 1, 15) // (v1, v2, v3, v4) é um destructuring
    val soma = v1 + v2 + v3 + v4
    val subtracao = v4 - v2
    val divisao = v4 / v1
    val multiplicacao = v1 * v2
    val modulo = v1 % 2

    println("$soma $subtracao $divisao $multiplicacao $modulo")

    // comparar tipo e valor (ou endereço de memória para objetos) ===
    // comparar valor ==
    println("teclado" === "teclado")
    println(3 !== 2) // Diferente de java que seria !=
    println(3 < 2)
    println(3 > 2)
    println(3 <= 2)
    println(3 >= 2)

    val d1 = Date(0)
    val d2 = Date(0)

    //!todo: Igualdade referencial e estrutural
    println("Resultado com '===' ${d1 === d2}") // endereços de memória diferentes (igualdade referencial)
    println("Resultado com '==' ${d1 == d2}") // compara valor (igualdade estrutural). Em java seria igualdade referencial (==)
    println("Resultado com equals igual ao '==' ${d1.equals(d2)}")

    val executouTrabalho1: Boolean = true
    val executouTrabalho2: Boolean = true

    val comprouSorvete: Boolean = executouTrabalho1 || executouTrabalho2
    val comprouTv50: Boolean = executouTrabalho1 && executouTrabalho2
    val comprouTv32: Boolean = executouTrabalho1 xor executouTrabalho2

    println(comprouSorvete)
    println(comprouTv50)
    println(comprouTv32)
    if (! comprouSorvete){
        println("A saude agradece")
    }

    var num1: Int = 1
    var num2: Int = 1

    println(++num1 == num2++)
    println(++num1 == ++num2)
    println(num1++ == num2++)
}