package fundamentos.exception

fun main() {

    var a: Int? = null

    println(a!!.inc()) // !! assumo o risco de acessar variável nula lança exception

}