package secao9;
import java.util.Arrays;

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

        }
}

