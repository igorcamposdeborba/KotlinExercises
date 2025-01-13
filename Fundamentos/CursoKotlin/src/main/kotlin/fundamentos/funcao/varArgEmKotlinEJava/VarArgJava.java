package fundamentos.funcao.varArgEmKotlinEJava;

import java.util.Arrays;

public class VarArgJava {
    public static void main(String[] args) {
        imprimirComVararg("Igor", "Roberto");
    }

    public static void imprimirComVararg(String... params) { //todo: ... varArgs em Java
        System.out.println(Arrays.toString(params));
    }
}
