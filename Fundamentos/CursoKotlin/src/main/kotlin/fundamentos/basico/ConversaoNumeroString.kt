package fundamentos.basico

fun main() {
    val a: Int = 1
    val b: String = "2"
    val c: String = "teste"

    println(a + b.toInt() + (c.toIntOrNull() ?: 0));

    if(b is String) {
        println("String $b")
    } else if (b !is String){
        println("Não é uma string")
    }
}