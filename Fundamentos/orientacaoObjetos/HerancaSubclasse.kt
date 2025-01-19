package fundamentos.orientacaoObjetos
                                                          // : Carro é uma herança
class Ferrari: Carro(velocidadeMaxima = 350), Esportivo { // Esportivo é uma interface
    override var turbo: Boolean = false
        get() = field // implementacao padrao de get e set
        set(value) { field = value }

    override fun acelerar(){
        super.alterarVelocidadeEm(if(turbo) 50 else 25)
    }
    override fun frear(){
        alterarVelocidadeEm(-25) // super é facultativo em herança no kotlin
    }
}