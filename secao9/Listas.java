package secao9;

import java.util.Arrays;
import java.util.ArrayList;

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
                System.out.println("Letra procurada está na lista: " + letra);
            }
        }
    
        // 4 - Loops com if

        //filtrar e somar numeros pares
        int somaPares = 0;

        for(int numero : numeros) {

            if (numero % 2 == 0) {
                somaPares += numero;
            }
        }

        System.out.println("soma pare: " + somaPares);

        //exibir valores maiores que um determinado valor
        int[] nums = {12, 6, 18, 24, 48, 5};

        int limite = 10;

        for(int i = 0; i < nums.length; i++) {

            if (nums[i] > limite) {
                System.out.println("Numero maior encontrado: " + nums[i]);
            }
        }
    
    String[] linguagens = {"java", "C", "Python", "PHP"};

    String linguagemAlvo = "Python";

    for(String linguagem : linguagens) {

        if (linguagemAlvo == linguagem) {
            System.out.println("Linguagem encontrada! Parando o loop");
            break;
        } else {
            System.out.println("Linguagem ainda não encontrada");
        }
    }
    

    // 5 - Atualizar valores
    for(int i = 0; i < numeros.length; i++) {

        numeros[i] *= 2;

    }

    System.out.println(numeros[1]);

    for(int numero : numeros ) {
        System.out.println("Numeros dobrados: " + numero);
    }

        numeros[5] = 1;

        System.out.println(numeros[5]);

        for(int i = 0; i < frutas.length; i++) {

            if (frutas[i].equals("Maçã")) {
                
                frutas[i] = "Abacate";
            }
        }

        System.out.println(frutas[0]);

        //não se pode fazer atribuição com o foreach

        // 6 - ToString

        //Classes no java, que vão ter metodos utilitarios, o arrray é uma delas
        String dadosNumericos = Arrays.toString(numeros);

        System.out.println(dadosNumericos);
        System.out.println(numeros);

        String dadosFrutas = Arrays.toString(frutas);
        System.out.println(dadosFrutas);

        int[] teste = new int[3];

        System.out.println(Arrays.toString(teste));

        // 7 - Adicionando novos itens a arrays

        // ex1: criando um novo array maior e copiando os elementos

        int[] novoArray = new int[numeros.length + 1];

        for(int i = 0; i < numeros.length; i++) {
            novoArray[i] = numeros[i];
        }

        System.out.println(Arrays.toString(novoArray));

        novoArray[novoArray.length - 1] = 4;

        System.out.println(Arrays.toString(novoArray));

        //ex2: utilizando arraycopy para copiar os elementos

        String[] novoFrutas = new String[frutas.length + 1];

        System.arraycopy(frutas, 0, novoFrutas, 0, frutas.length);

        novoFrutas[novoFrutas.length - 1] = "Jaca";

        System.out.println(Arrays.toString(novoFrutas));

        // ex3: usando ArrayList
        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maçã", "Banana",
        "Laranja"));

        System.out.println(listaFrutas);

        listaFrutas.add("Manga");

        System.out.println(listaFrutas);

        // 8 - Reference trap
        int[] arrayOriginal = {1,2,3};

        //programou muita coisa...
        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayCopia));

        //como evitar?
        int[] arrayClone = arrayOriginal.clone();

        arrayClone[0] = 999;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClone));

        // 9 - Matrizes
        // [[1,2], [2,3]]
        //array[0][1]

        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        System.out.println(matriz[2][0]);

        //criando array 2d vazio e preenchendo
        int[][] tabela = new int[3][3];

        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        for (int[] linha : tabela) {
            System.out.println(Arrays.toString(linha));
        }

        int [][] grade = new int[4][5];

        for(int m = 0; m < grade.length; m++) {
            for(int n = 0; n < grade[m].length; n++) {
                grade[m][n] = m * n;
            }
        }

        for (int[] linha : grade) {
            System.out.println(Arrays.toString(linha));
        }
    }
}
