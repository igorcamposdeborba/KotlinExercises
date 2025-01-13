package fundamentos.basico

fun identificarTipoComWhen(x: Any){
    when(x) {
        is String -> println(x.uppercase())
        is Int -> println(x.plus(3))
        else -> println("Nao eh String e nem Int")
    }
}

fun identificarTipo(x: Any){
    if(x is String){
        println(x.uppercase()) //!todo: smart cast: disponibiliza os métodos exclusivos da String quando verifiquei o tipo via is
    } else if (x is Int){
        println(x.plus(3))
    }
}

fun identificarTipoComWhenEConversaoOpcional(x: Any){
    when(x as? Int) { // ? conversão opcional para Int e transforma em null
        9, 10 -> println("Nota $x eh A")
        in 6..8 -> println("Nota $x eh passou") // range .. tem que usar in
        else -> println("Reprovado")
    }
}

fun main() {
    identificarTipoComWhen("teclado")
    identificarTipoComWhen(2)
    identificarTipoComWhen(true)

    identificarTipo("mouse")
    identificarTipo(1)

    identificarTipoComWhenEConversaoOpcional(6)
    identificarTipoComWhenEConversaoOpcional(5)
}