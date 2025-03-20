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

    System.out.println(Arrays.deepToString(matriz));
    }
}
