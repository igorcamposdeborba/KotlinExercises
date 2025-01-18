package fundamentos.funcoes

data class Casa(var endereco: String = "", var num: Int = 0)

fun main() {
    var casa: Casa = Casa()
    casa.run {
        endereco = "Rua ABC"
        num = 1354
    }
    println(casa)
}