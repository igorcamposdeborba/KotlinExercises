package fundamentos.estruturasDeControle

fun main() {
    for (i in 1..10){
        if (i == 5){
            continue
        }
        println("Atual: $i")
    }
}