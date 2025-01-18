package fundamentos.funcoes

fun main() {
    val listWithNulls: List<String?> = listOf("Igor", null, "Roberto", "Laura")

    for (item in listWithNulls) {
        // let é uma função de escopo
        item?.let {
            println(it)
        }
    }
}