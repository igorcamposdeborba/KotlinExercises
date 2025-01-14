package fundamentos.classe

class ClasseBasicaB(var dia: Int, var mes: Int, var ano: Int) {

    fun formatar(): String{
        return "${dia}/${mes}/${ano}"
    }
}

fun main() {
    var nascimento: ClasseBasicaB = ClasseBasicaB(1, 6, 1994)
    with(nascimento) {
        println("${dia}/${mes}/${ano}")
    }

    nascimento.mes = 12
    println(nascimento.formatar())
}