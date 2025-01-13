package fundamentos.funcao

// !todo: funcao inline - muito usado em transaction
inline fun transacao(funcao: () -> Unit) {
    println("abrir transacao")
    try {
        funcao()
    } finally {
        println("fechada transacao")
    }
}

fun main() {
    transacao {
        println("Executando SQL 1")
        println("Executando SQL 2")
    }
}