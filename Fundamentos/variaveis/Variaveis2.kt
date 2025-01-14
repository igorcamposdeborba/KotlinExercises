package fundamentos.variaveis
val diretamenteNoArquivo: String = "Bom dia" // variável static

fun topLevel(){
    val local = "Igor" // variável static
    println("$diretamenteNoArquivo $local")
}

// variável de objeto (instancia)
class Variaveis2 {
    var variavelDeInstancia: String = "Boa noite"
    companion object { // companion é um Singleton (padrão de projeto) para o objeto dessa classe
        @JvmStatic val constanteStaticDeClasse = "Fulano" // JvmStatic mantém como static ao compilar o arquivo e evitar converter para um atributo do objeto da subclasse companion
    }

    fun fazer(){
        val local: Int = 7
        if(local > 3){
            val variavelDeBloco = "Beltrano"
            println("${diretamenteNoArquivo}, $variavelDeInstancia, $constanteStaticDeClasse, $local, $variavelDeBloco")
        }
    }
}

fun main() {
    topLevel() // Funcao static
    Variaveis2().fazer() // intanciar objeto
    println(Variaveis2.constanteStaticDeClasse) // atributo static da classe Variaveis2
}