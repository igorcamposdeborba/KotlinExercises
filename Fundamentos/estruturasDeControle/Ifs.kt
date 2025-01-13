package fundamentos.estruturasDeControle

import kotlin.jvm.internal.Ref.ObjectRef

fun main() {
    val nota1: Double = 8.3
    val nota2: Double = 9.0

    if (nota1 >= 7.0){
        println("Aprovado com nota ${nota1}")
    } else {
        print("reprovado")
    }


    // If guardado em variável (não existe ternário em Kotlin)
    val maiorValor : String = if (nota1 > nota2) "Nota 1: $nota1" else "Nota 2: $nota2"

    println("Maior valor: $maiorValor")


    // Range inclusivo com ..
    if (nota1 in 9.0..10.0){
        println("Fantastico " + nota1)
    } else if (nota1 in 6.0..8.9){
        println("Bom " + nota1)
    } else {
        println("Ruim " + nota1)
    }

    println(5 in 4..7)

    println(calcularAprovacao(8.0))
}

fun calcularAprovacao(nota: Double) : String = if(nota >= 7) "Aprovado" else if(nota >= 6) "Passou" else "Reprovado"