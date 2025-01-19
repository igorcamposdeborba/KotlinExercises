package fundamentos.orientacaoObjetos

annotation class Positivo
annotation class NaoVazio

class Humano(id: Int, nome: String) {
    @Positivo
    var id: Int = id

    @NaoVazio
    var nome: String = nome

    override fun toString(): String = "Pessoa(id=${id} nome=$nome"
}

// Reflection: pegar atributo mesmo estando private
fun getValor(objeto: Any, nomeDoAtributo: String): Any {
    val atributo = objeto.javaClass.getDeclaredField(nomeDoAtributo) // pegar atributo
    val estaAcessivel = atributo.isAccessible // guardar se está acessível (public) ou não (private, protected)

    atributo.isAccessible = true // temporariamente mudar para public o atributo
    val valor = atributo.get(objeto)  // guardar o atributo
    atributo.isAccessible = estaAcessivel // voltar a visibilidade original

    return valor;
}

// refection: validar annotations personalizadas que eu criei
fun validar(objeto: Any): List<String> {
    val msgs = ArrayList<String>()
    objeto::class.members.forEach { member ->
        member.annotations
            .forEach { annotation ->
                val valor = getValor(objeto, member.name)
                when (annotation) {
                    is Positivo -> if (valor !is Int || valor <= 0) {
                        msgs.add("O valor ${valor} nao eh um numero positivo")
                    }

                    is NaoVazio -> if (valor !is String || valor.trim().isBlank()) {
                        msgs.add("O valor ${valor} nao eh uma String valida")
                    }
                }
            }
    }
    return msgs
}

fun main() {
    val pessoa1 = Humano(1, "Igor")
    println(validar(pessoa1))
    val pessoa2 = Humano(-1, "")
    println(validar(pessoa2))
}