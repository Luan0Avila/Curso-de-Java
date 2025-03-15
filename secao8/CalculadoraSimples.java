package secao8;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double x;
        double y;

        System.out.println("\nBem vindo a nossa Calculadora simples!!! \n");

        do {
            System.out.println("Escolha uma das opçoes abaixo\n");
            System.out.println("1- Soma");
            System.out.println("2- Subtração");
            System.out.println("3- Multiplicação");
            System.out.println("4- Divisão");
            System.out.println("5- Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Voce escolheu Soma\nDigite o primeiro numero");
                    x = scanner.nextDouble();
                    System.out.println("Digite o segundo numero");
                    y = scanner.nextDouble();
                    soma(x, y);
                    break;
                case 2:
                    System.out.println("Voce escolheu subtração\nDigite o primeiro numero");
                    x = scanner.nextDouble();
                    System.out.println("Digite o segundo numero");
                    y = scanner.nextDouble();
                    subtracao(x, y);
                    break;
                case 3:
                    System.out.println("Voce escolheu multiplicação\nDigite o primeiro numero");
                    x = scanner.nextDouble();
                    System.out.println("Digite o segundo numero");
                    y = scanner.nextDouble();
                    multiplicacao(x, y);
                    break;
                case 4:
                System.out.println("Voce escolheu divisão\nDigite o primeiro numero");
                    x = scanner.nextDouble();
                    System.out.println("Digite o segundo numero");
                    y = scanner.nextDouble();
                    deivisao(x, y);
                    break;
                case 5:
                    System.out.println("\n Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao !=5);

        scanner.close();
    }

    public static void soma(double x, double y) {
        System.out.println(x + " + " + y + " = " + (x+y));
    }

    public static void subtracao(double x, double y) {
        System.out.println(x + " - " + y + " = " + (x-y));
    }

    public static void multiplicacao(double x, double y) {
        System.out.println(x + " * " + y + " = " + (x*y));
    }

    public static void deivisao(double x, double y) {
        
        if (y == 0) {
            System.out.println("Divisão Inválida");
        } else {
            System.out.println(x + " / " + y + " = " + (x/y));
        }
    }

}
