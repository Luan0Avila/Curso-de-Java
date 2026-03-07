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
        
        System.out.println();

        // 3 - bounded types
        Comparador<Integer> comparadorInteiros = new Comparador<>();

        System.out.println("maior numero entre 20 e 10 " + comparadorInteiros.obterMaior(20, 10));
    
            Comparador<Double> comparadorDoubles = new Comparador<>();

        System.out.println("maior numero entre 20 e 10 " + comparadorDoubles.obterMaior(20.2, 10.10));
    
        // 4 - wildcard
        List<Integer> nums2 = List.of(1,2,3,4,5,6,7);
        List<String> paList = List.of("teste","teste","etset");

        // aceita qualquer tipo de lista
        imprimirLista(paList);
        imprimirLista(nums2);

        // aceita apenas listas numericas
        System.out.println(somarNumeros(nums2));
    
        // aqui não é aceito por ser uma lista de Strings, caso fosse
        // double, int, ou um outro tipo numerico funcionaria
        //System.out.println(somarNumeros(paList));

        List<Integer> nums3 = new ArrayList<>();

        adicionarNums(nums3);

        System.out.println(nums3);

        for (Integer number : nums3) {
            System.out.println(number);
        }

    }

    public static <T extends Comparable<T>> T obterMaior(T valor1, T valor2) {
        return (valor1.compareTo(valor2) > 0) ? valor1 : valor2;
    }

    public static<T> void imprimirArray(T[] array) {
        for(T elemento : array) {
            System.out.print(elemento + ", ");
        }
    }

    public static void imprimirLista(List<?> lista) {
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static double somarNumeros(List<? extends Number> lista) {
        double soma = 0;

        for (Number number : lista) {
            soma += number.doubleValue();
        }

        return soma;
    }

    // Aceita apenas numeros inteieros
    public static void adicionarNums(List<? super Integer> lista) {
        for(int i = 1; i <= 5; i++) {
            lista.add(i);
        }
    }
}
