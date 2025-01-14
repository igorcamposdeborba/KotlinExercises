package fundamentos.classe

class ClasseBasica1 (var nome: String){ // todo: Atributo disponível sem precisar declarar (precisa ter var ou val)
}
class ClasseBasica2 (val nome: String){
}
class ClasseBasica3 (nome: String){ // !todo: disponível apenas no construtor
    var nome: String = nome
}
class ClasseBasica4 (nome: String){ // !todo: disponível apenas no construtor
}
fun main() {
    val cliente1: ClasseBasica1 = ClasseBasica1("Igor")
    println(cliente1.nome)

    val cliente2: ClasseBasica2 = ClasseBasica2("Igor")
    println(cliente2.nome)

    val cliente3: ClasseBasica3 = ClasseBasica3("Igor")
    println(cliente3.nome)
    cliente3.nome = "Roberto"
    println(cliente3.nome)

    val cliente4: ClasseBasica4 = ClasseBasica4("Laura")
    println(cliente4)
}