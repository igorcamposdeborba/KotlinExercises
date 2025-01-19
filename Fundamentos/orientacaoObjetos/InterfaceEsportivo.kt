package fundamentos.orientacaoObjetos

interface Esportivo {
    var turbo: Boolean

    fun ligarTurbo(){
        turbo = true // valor padrão: kotlin permite implementacao padrao em todos os métodos
    }
    fun desligarTurbo(){
        turbo = false
    }
}