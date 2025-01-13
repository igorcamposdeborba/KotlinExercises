package fundamentos.funcao

fun imprimirMaior1(a: Int, b: Int): Unit{
    return println(Math.max(a, b))
}
fun imprimirMaior2(a: Int, b: Int): Unit{
    println(Math.max(a, b))
    return
}
fun imprimirMaior3(a: Int, b: Int){
    println(Math.max(a, b))
    return Unit
}

fun main() {
    imprimirMaior1(2, 1)
    imprimirMaior2(2, 1)
    imprimirMaior3(2, 1)
    imprimirMaior2(2, 1).run{2 > 1}.run{println("Resultado = $this")} // Unit (Void em Java) permite chamar métodos
}