package fundamentos.estruturasDeControle

fun main() {
    for(i in 1..10){
        if (i === 5) {
            break
        }
        println("atual: $i")
    }

    // break rotulado (evite ao máximo) @nomeDoRotulo
    loop1@for (i in 1..15){
        for (j in 1..15){
            if (i == 2 && j === 9){
                break@loop1
            }
            println("$i $j")
        }
    }
}