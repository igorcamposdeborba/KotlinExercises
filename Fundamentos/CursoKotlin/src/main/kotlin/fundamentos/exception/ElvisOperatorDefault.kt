package fundamentos

fun main(args : Array<String>) {

    val opcional: String? = null; // ? null safety
    val obrigatorio: String = opcional?:"valor padrao" // ?: valor padrão com elvis operator

    println(obrigatorio)

}