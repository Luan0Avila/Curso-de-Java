package secao7;

import java.util.Scanner;
public class Exercicios {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Exercicio 1
        int soma = 0;

        for(int x = 0; x <= 100; x++ ) {
            soma += x;

        }
        System.out.println(soma);

        //Exercicio 2
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
                
            }
            num ++;
        }

        //Exercicio 3
        int numPrimo = 11;

        boolean ePrimo = true;

        for(int i = 2; i < numPrimo; i++) {

            if (numPrimo % i == 0) {
                ePrimo = false;
                break;
            }
        }

        if (ePrimo) {
            System.out.println("O numero " + numPrimo + " é um numero primo");
        } else {
            System.out.println("O numero " + numPrimo + " não é um numero primo");
        }
    
        //Exercicio 4

        int op;
        
        do{
            
            System.out.println("Escolha uma das opções abaixo:");
            System.out.println("1 - Luan");
            System.out.println("2 - Lady");
            System.out.println("3 - Luna");
            System.out.println("4 - Sair");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Voce escolheu a opção 1");
                    break;
                case 2:
                    System.out.println("Voce escolheu a opção 2");
                    break;    
                case 3:
                    System.out.println("Voce escolheu a opção 3");
                break;
                case 4:
                    System.out.println("Voce escolheu a opção 4, até mais!!");
                break;
                default:
                    System.out.println("Opção Inválida!");
                break;
            }
        } while (op != 4);      
        
        //Exercicio 5
        int numFatorial = 5;
        int fatorial = 1;

        for(int i = 1; i <= numFatorial; i++) {

            fatorial *= i;
            
        }
        System.out.println(fatorial);


        //Exercicio 6
        int numeroSaber = 1000;

        int contador = 0;
        while (numeroSaber != 0) {
            
            numeroSaber = numeroSaber / 10;


            contador ++;
        }
System.out.println(numeroSaber + " = " + contador);

        scanner.close();
}
}
