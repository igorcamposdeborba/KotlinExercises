package fundamentos

fun main (args: Array<String>) {

    val blocoHighOrderFunction = {
    println("Primeiro")
    }

    blocoHighOrderFunction()

    print("Segundo")
}