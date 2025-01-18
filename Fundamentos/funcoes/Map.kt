package fundamentos.funcoes
import java.util.Locale

class Produto(val nome: String, val preco: Double)

val materialEscolar = listOf<Produto>(
                            Produto("Caderno", 22.40),
                            Produto("Lapis", 0.70),
                            Produto("Apontador", 1.20)
)

fun main() {
    val alunos: List<String> = arrayListOf("Igor", "Roberto", "Luiza", "Laura")

    alunos.map { it.uppercase(Locale("pt", "BR")) }
                          .apply { println(this) }

    val totalizar = { acumulador: Double, atual: Double -> acumulador + atual} // interface funcional
    val precoTotal = materialEscolar.map { it.preco }
                                    .reduce(totalizar)
                                    .apply { println("Preco medio: R$" + this / materialEscolar.size) }
    // apply é uma nova "stream" porque reduce retorna um valor generics. Por isso consigo imprimir em apply e em println da variável a média

    println("Media de preco: R$${precoTotal/ materialEscolar.size}")

}