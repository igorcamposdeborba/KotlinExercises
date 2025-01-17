package fundamentos.classe

data class Carro(var marca: String, var modelo: String, var velocidade: Int = 0)

fun porReferencia(carro: Carro){
    carro.velocidade++ // é possível mudar os atributos do objeto, mas não o próprio objeto (porque mudaria o endereco de memória do objeto)
}

fun main() {
    var carro1 : Carro = Carro("Fiat", "Argo")
    var carro2 : Carro = carro1 // apontando para o mesmo endereco de memória

    carro2.modelo = "Edge"
    println("Carro 1 $carro1")

    carro1 = Carro("Audi", "A4")

    porReferencia(carro1) // apontando para atributos do mesmo objeto, mas esses atributos podem ter valores diferentes mesmo apontando para o mesmo objeto porque a referencia do atributo mudou na funcao porReferencia(), mas o objeto permaneceu no mesmo endereco de memoria

    println("Carro 1 $carro1")
    println("Carro 2 $carro2")
}