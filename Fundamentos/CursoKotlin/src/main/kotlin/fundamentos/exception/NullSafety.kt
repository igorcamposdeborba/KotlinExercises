package fundamentos

fun main(args: Array<String>) {

    var a :Int? = null // ? é safe call operator para indicar que essa variável pode ser null

    println(a?.dec())
}