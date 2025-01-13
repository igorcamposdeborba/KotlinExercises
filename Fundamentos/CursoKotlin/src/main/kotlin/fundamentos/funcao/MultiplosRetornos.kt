package fundamentos.funcao

import java.util.Calendar

data class Horario(val hora: Int, val minuto: Int, val segundo: Int) {}

// todo: Múltiplos retornos: Instanciar objeto para dividir do destructuring para obter múltiplos retornos
fun agora(): Horario {
    val agora = Calendar.getInstance()

    with(agora) {
        return Horario(get(Calendar.HOUR), get(Calendar.MINUTE), get(Calendar.SECOND))
    }
}

fun main(args: Array<String>) {
    val (h, m, s) = agora() // todo: Múltiplos retornos com o destructuring para dividir em tres variaveis
    println("$h:$m:$s")
}