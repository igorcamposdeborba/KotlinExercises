package fundamentos.funcao.alterarClasseKotlin;

import fundamentos.funcao.AlterarClasseKotlinSemHerancaKt;
import kotlin.collections.CollectionsKt;

import java.util.Arrays;
import java.util.List;

public class ChamarFuncaoKotlinNoJava {
    public static void main(String[] args) {
        List<String> lista = CollectionsKt.listOf("Igor", "Roberto", "Laura");

        System.out.println(AlterarClasseKotlinSemHerancaKt.secondOrNull(lista));

        imprimirComVararg("Igor", "Roberto");;
    }

    public static void imprimirComVararg(String... params) { // varArgs em Java
        System.out.println(Arrays.toString(params));
    }

}
