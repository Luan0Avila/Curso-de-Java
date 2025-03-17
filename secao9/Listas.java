package secao9;

public class Listas {
    public static void main(String[] args) {
        
        // 1 - sintaxe
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

        //{ELEN1,ELMEN2, ...}

        System.out.println("acessando primeiro el: " + numeros[0]);

        //tamanho fixo, mas vazio
        String[] frutas = new String[3];

        // 0, 1 e 2 => add elementos
        //3 => não tenho

        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Mamão";

        System.out.println(frutas[1]);

        double[] precos = {1.99, 2.45, 4.97};

        precos[2] = 5;
    
        System.out.println(precos[2]);

        // 2 - Loops em Arrays
        
        //somar todos os elementos de um array
        int soma = 0;

        //length => a qtd de elementos de um array

        for(int i = 0; i < numeros.length; i++) {

            //i > 0; i > 1 ...
            //numeros[i] = numeros[0] => 1
            soma += numeros[i];
        }

        System.out.println("Soma dos elementos: " + soma);

        // for each
        // Nomear o item => Array
        //Pessoas => Pessoa
        //Frutas => Fruta
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // encoontrar o maior valor de um array
        int[] valores = {10, 25, 8, 22, 1};

        int maiorValor = valores[0];

        int j = 0;
        while (j < valores.length) {
            
            if (valores[j] > maiorValor) {
                maiorValor = valores[j];
            }
            j++;
        }

        System.out.println("O maior valor é " + maiorValor);
    
        // 3 - Foreach
        for(int numero : numeros) {
            System.out.println("O numero é " + numero);
        }

        //Concatenar elementos  de um array
        String[] palavras = {"java", "é", "bom"};

        String frase = "";
        for(String palavra : palavras) {
            frase += palavra + " ";
        }

        System.out.println(frase);

        // verificar se valor está presente em array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letraProcurada = 'i';

        for (char letra : letras) {

            if (letra == letraProcurada) {
                System.out.println("Letra procurada está na lista " + letra);
            }
        }
    
    }
}
