package secao5;

import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    public static void main(String[] args) {
        
        // 12 - Função recursiva
        int soma = somaRecursiva(6);

        System.out.println(soma);
    
        // 13 - Method overloading
        System.out.println(soma(1, 1));
        System.out.println(soma(2, 2, 2));
        System.out.println(soma(1.5, 2.25));

        // 14 - Lambda Expressions
        Runnable tarefa = () -> System.out.println("Minha função anonima!");

        tarefa.run();

        //(arg1,arg2) -> {}

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");

        nomes.forEach(nome -> System.out.println(nome));
    
    }

    public static int somaRecursiva(int x) {

        if (x == 1) {
            return 1;
        } else { // se x == 10 => 10 + (10 -1) => 10 + 9 => 19
            return x + somaRecursiva(x - 1);
        }
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return a + b + c;
    }

    public static double soma(double a, double  b) {
        return a + b;
    }
}
