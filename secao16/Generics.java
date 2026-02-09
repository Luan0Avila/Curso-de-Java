package secao16;

import java.util.*;

public class Generics {
    
    public static void main(String[] args) {
        

        // 1 - classes genéricas

        // quando o objeto for instanciado o T se torna ALGUMA COISA
        Caixa<Integer> caixaInteira = new Caixa<>();

        caixaInteira.adicionar(100);

        //caixaInteira.adicionar("teste");
        
        System.out.println(caixaInteira.obter());

        Caixa<String> caixaStr = new Caixa<>();

        caixaStr.adicionar("teste");

                System.out.println(caixaStr.obter());

        // 2 - métodos genericos
        System.out.println("Maior valor entre 5 ew 10 " + obterMaior(5, 10));
        System.out.println("Maior valor entre Java e Python " + obterMaior("Java", "Python"));

        String[] letras = {"a", "b", "c", "d"};

        Integer[] numeros = {11, 17, 8, 0, 10};

        Boolean[] bools = {true, false, false, true};
        
        imprimirArray(letras);
        imprimirArray(numeros);
        imprimirArray(bools);
        
    }

    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2) {
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static<T> void imprimirArray(T[] array) {
        for(T elemento : array) {
            System.out.print(elemento + ", ");
        }
    }
}
