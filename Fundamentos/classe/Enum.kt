package fundamentos.classe

enum class Enum1 {
    DOMINGO, SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO
}

enum class Enum2 (val id: Int, val nome: String, val diaUtil: Boolean) {
    DOMINGO(1, "Domingo", false),
    SEGUNDA(2, "Segunda", true),
    TERCA(3, "Terca", true),
    QUARTA(4, "Quarta", true),
    QUINTA(5, "Quinta", true),
    SEXTA(6, "Sexta", true),
    SABADO(7, "Sabado", false)
}

fun main() {
    println("O melhor dia da semana eh ${Enum1.SABADO}")

    println("O melhor dia da semana eh ${Enum2.SABADO.nome}")
    println()

    for (dia in Enum2.values()) {
        println("${dia.nome} eh um dia ${if (dia.diaUtil) "Util" else "do fim de semana"}")
    }
}