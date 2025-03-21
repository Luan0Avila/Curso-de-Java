package secao9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ListasB {
    public static void main(String[] args) {
        
        // 1 - Ordenação de arrays
        //Ordenação array de inteiros
        int[] inteiros = {5,6,2,1,3,7,8,4,9};

        //Modifica o array original
        Arrays.sort(inteiros);
        
        System.out.println(Arrays.toString(inteiros));

        //Ordenação com comparator
        String[] nomes = {"joão", "bob", "pedro", "marco"};

        Arrays.sort(nomes);

        System.out.println(Arrays.toString(nomes));

        Arrays.sort(nomes, Comparator.reverseOrder());

        System.out.println(Arrays.toString(nomes));
    
    //Ordenação de matriz
    int[][] matriz = {
        {4,5,1},
        {3,8,9},
        {2,3,1}
    };
    // Ordenação de linhas, por um valor de coluna
    Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));
    
    for(int[] linha : matriz) {
        System.out.println(Arrays.toString(linha));
    }

    //Imprimir matriz sem foreach
    System.out.println(Arrays.deepToString(matriz));

    // 2 - Manipulação de Arrays avançado

    //copia
    int[] original = {1,2,3,3};

    int[] copia = Arrays.copyOf(original, 2);

    System.out.println(Arrays.toString(copia));

    //fill - preenchimento
    int[] numeros = new int[5];

    System.out.println(Arrays.toString(numeros));
    
    Arrays.fill(numeros, 5);
    System.out.println(Arrays.toString(numeros));

    //Transformação de arrays para stream
    int[] values = {1,2,3,4,5};

    //fazer soma de todos os elementos
    int sum = Arrays.stream(values).sum();

    System.out.println(sum);

    // 3 - Arrays Dinamicos
    ArrayList<String> frutas = new ArrayList<>();

    System.out.println(frutas);

    frutas.add("Maçã");

    frutas.add("Banana");

    System.out.println(frutas);

    for(String fruta : frutas) {
        System.out.println(fruta);
    }

    frutas.remove("Banana");

    System.out.println(frutas);

    frutas.remove(0);

    System.out.println(frutas);

    frutas.add("Maçã");

    String frutaEspecifica = frutas.get(0);

    System.out.println(frutaEspecifica);

    //Não funciona com indice diretamente
    }
}
