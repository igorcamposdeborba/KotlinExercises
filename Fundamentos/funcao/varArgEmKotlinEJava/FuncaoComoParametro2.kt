package fundamentos.funcao.varArgEmKotlinEJava

fun <T> filtrar(lista: List<T>, filtro: (T) -> Boolean): List<T> {
    val listaFiltrada = ArrayList<T>()
    for (i in lista){
        if(filtro(i)){
            listaFiltrada.add(i)
        }
    }
    return listaFiltrada
}

fun comTresLetras(nome: String): Boolean{
    return nome.length == 3
}

fun main() {
    val nomes = listOf<String>("Igor", "Bia", "Roberto", "Ana")
    println(filtrar(nomes, ::comTresLetras))
}