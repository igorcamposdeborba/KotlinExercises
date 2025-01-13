package fundamentos.funcao.varArgEmKotlinEJava

fun ordenar(vararg numeros: Int): IntArray{ // todo: vararg em kotlin
    return numeros.sortedArray();
}

fun main() {

    for (i in ordenar(5, 1, 7, 4)){
        println("$i")
    }
}