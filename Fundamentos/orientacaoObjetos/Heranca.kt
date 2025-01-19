package fundamentos.orientacaoObjetos

// todo: open significa que é open para ser herdada, senão não pode ser herdada. Diferente do Java que para não deixar uma classe ser herdada devo colocar o modificador final
open class  Carro (val velocidadeMaxima: Int = 200, var velocidadeAtual: Int = 0 ){
    protected fun alterarVelocidadeEm(velocidade: Int){
        val novaVelocidade = velocidadeAtual + velocidade

        velocidadeAtual = when(novaVelocidade) {
            in 0..velocidadeMaxima -> novaVelocidade
            in velocidadeMaxima + 1 ..Int.MAX_VALUE -> velocidadeMaxima
            else -> 0
        }
    }
    open fun acelerar(){ // open: permite que seja sobrescrito com override
        alterarVelocidadeEm(5)
    }
    open fun frear(){
        alterarVelocidadeEm(-5)
    }

    override fun toString(): String{
        return "Velocidade atual: $velocidadeAtual"
    }
}



fun main() {
    val carro = Ferrari()
    carro.acelerar()
    println(carro)

    carro.ligarTurbo()
    carro.acelerar()
    println(carro)

    carro.frear()
    carro.frear()
    println(carro)
}