package fundamentos

fun main(args : Array<String>) {
    imprimirSomaVoid(2, 3)

    println(imprimirSomaReturn(1))
}

fun imprimirSomaVoid(a : Int, b : Int) : Unit{ // Unit é igual a Void do Java
    println(a.plus(b))
}

fun imprimirSomaReturn(a:Int, b:Int = 10) : Int { // valor default = 10
    return a.plus(b)
}
