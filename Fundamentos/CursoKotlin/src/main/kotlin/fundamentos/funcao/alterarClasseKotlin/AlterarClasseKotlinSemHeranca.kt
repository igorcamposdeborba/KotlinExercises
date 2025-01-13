package fundamentos.funcao

// todo: incrementar funcionalidade na List sem herança
// <T> primeiro generics: informa que vai trabalhar como uma Lista genérica
// <T> segundo: especifica qual é o tipo da Lista que estou trabalhando
// T? terceiro: retorno E opcional (com valor preenchido ou vem null se não de match com o tipo)
fun <T> List<T>.secondOrNull(): T? = if(this.size >= 2) this.get(1) else null

fun main() {
    val lista: List<String> = listOf("Igor", "Roberto", "Laura")
    println(lista.secondOrNull())
}