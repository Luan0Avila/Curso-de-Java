package secao9;
import java.util.Arrays;
import java.util.ArrayList;

public class Exercicios {
    public static void main(String[] args) {
        
        // Exercicio 1
        int[] array = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[array.length];

        for(int i = 0; i < array.length; i++) {

            arrayInvertido[i] = array[array.length -1 -i];
            }

            System.out.println(Arrays.toString(array));
            System.out.println(Arrays.toString(arrayInvertido));


        // Exercicio 2
        int[] array2 = {1,2,3,4,5,6,7,7,10,11,9,4,3,5,11,11};
            int maisFrequente = array2[0];
            int maxContagem = 1;

            for(int i = 0; i < array2.length; i ++) {
                int contagem = 0;
            
                for(int j = 0; j < array2.length; j++) {
                    if (array2[j] == array2[i]) {
                        contagem ++;
                    }
                }
            if (contagem > maxContagem) {
                maxContagem = contagem;
                maisFrequente = array2[i];
            }
            
        }
        System.out.println("O numero mais frequente é " + maisFrequente);


        // Exercicio 3
        int[][] matriz = {
            {1,2,3},
            {4,5,6}
        };

        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];

        for(int[] linha : matrizTransposta) {
            System.out.println(Arrays.toString(linha));
        }
        
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }
        for(int[] linha : matrizTransposta) {
            System.out.println(Arrays.toString(linha));
        }


        // Exercicio 4
        int[] inteiros = {-1,2,3,4,-5,6,7,8,9};

        System.out.println(Arrays.toString(inteiros));

        for(int i = 0; i <inteiros.length; i++) {

            if (inteiros[i] < 0) {
                inteiros[i] = 0;
            }
        }
        System.out.println(Arrays.toString(inteiros));

        // Exercicio 5 
        int[] duplicados = {1,1,2,2,3,3};

        ArrayList<Integer> naoDuplicados = new ArrayList<>(); 

        for(int numero : duplicados) {

            if (!naoDuplicados.contains(numero)) {
                naoDuplicados.add(numero);
            }
        }

        System.out.println(Arrays.toString(duplicados));
        System.out.println(naoDuplicados);


    }
}

