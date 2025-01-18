package fundamentos.estruturaDeDados

import fundamentos.variaveis.topLevel

fun main() {
    // Map não pode alterar porque é imutável
    val mapa0: Map<Long, String> = mapOf<Long, String>(1231L to "Igor",
                                                       3432L to "Luiza",
                                                       6486L to "Roberto",
                                                       9984L to "Laura")

    // Interface genérica de Map (mas que pode alterar os dados)
    val mapa1: MutableMap<Long, String> = mutableMapOf<Long, String>(1231L to "Igor",
                                                                    3432L to "Luiza",
                                                                    6486L to "Roberto",
                                                                    9984L to "Laura")
    // HashMap é implementação específica de Map, mas que pode alterar valores (mutável)
    val mapa2: HashMap<Long, String> = hashMapOf<Long, String>(1231L to "Igor",
        3432L to "Luiza",
        6486L to "Roberto",
        9984L to "Laura")

    mapa0.map { it.value + " Borba" }
    // Isto não iria alterar o Map porque é imutável
    // mapa0.forEach { (key, value) ->
    //     mapa0.put(key, "${value} Borba")
    // }
    mapa0.print()

    // Vai alterar MutableMap
    mapa1.put(8645, "Tina")
    mapa1.remove(1231)
    mapa1.forEach({(key, value) ->
        mapa1[key] = value + " Borba"
    })
    mapa1.print()

    mapa2.put(9985, "Andre")
    mapa2.forEach({(key, value) ->
        mapa2[key] = value + " Borba"
    })
    mapa2.print()

}