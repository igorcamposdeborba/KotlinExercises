package fundamentos
import kotlin.reflect.typeOf

fun main(args: Array<String>){
    var a : Int; // var é variável, que muda
    var b = 2; // tipo inferido

    a = 10;

    println(a::class.simpleName) // imprimir o tipo de dado
    println(a::class.qualifiedName)

    tipoDeDado(a);

    print(a + b);

}

inline fun <reified T> tipoDeDado (value : T) : Unit {
    println(typeOf<T>())
}
