package fundamentos.funcao

fun relacaoDeTrabalho(chefe: String, subordinado: String){
    println("$chefe eh chefe de $subordinado");
}

fun main() {
    // todo: argumentos nomeados com ordem invertida
    relacaoDeTrabalho(subordinado = "Maria", chefe = "Joao")
}