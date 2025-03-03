package secao1;

import java.util.Scanner;

public class TesteScanner {
    
    public static void main(String[] args) {

        // 1 - testando scanner
        Scanner scanner = new Scanner(System.in);

        // Mensagem para usuário entender o que precisa digitar
        System.out.print("Digite seu nome: ");

        // Resgata o valor do terminal
        String nome = scanner.nextLine();

        // Exibe o valor
        System.out.println("Olá " + nome);

        // nextInt
        System.out.print("Digite sua idade: ");
        
        int numero = scanner.nextInt();

        System.out.println("Você tem" + numero + " anos");

        
        // 2 - Problema do nextLine
        
        System.out.print("Digite um numero: ");
        
        int n = scanner.nextInt();

        scanner.nextLine();
        
        System.out.print("Digite um texto: ");
        
        String txt = scanner.nextLine();

        System.out.println("Os dados são, n = " + n + " e txt =" + txt);
        
        // Fechamento do scanner para evitar memory leak
        scanner.close();
    }
}
