package secao3;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de um produto: ");

        double preco = scanner.nextDouble();


        if (preco < 50) {

            System.out.println("Barato");
            
        } else if (preco >= 50 && preco <= 100) {
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }

        scanner.nextLine();


        // Exercicio 2
        System.out.print("Digite seu nome de usuário: ");
        
        String userName = scanner.next();

        System.out.print("Digite sua senha: ");

        String senha = scanner.next();

        if (userName.equals("admin") && senha.equals("1234")) {
        
            System.out.println("Acesso permitido");
        
        } else {

            System.out.println("Acesso negado");

        }


        // Exercicio 3
        System.out.print("Digite um numero: ");

        int numero = scanner.nextInt();
        
        String resultado = "";

        if (numero % 2 == 0) {

            resultado = "Par";
            
        } else {

            resultado = "Impar";
        }

        System.out.println(resultado);


        //Exercicio 4
        System.out.println("Digite um numero de 1 a 7 (Referente a um dia da semana)");

        int dia = scanner.nextInt();

        switch (dia) {
            case 2, 3, 4, 5, 6:
                
            System.out.println("Dia útil");

                break;
        
            case 1, 7:

            System.out.println("Final de semana");

                break;
    
            default:

            System.out.println("não é um dia válido");

                break;
            
        }


        // Exercicio 5
        System.out.println("Digite um numero: ");

        int num = scanner.nextInt();

        if (num >= 10 && num <= 20) {

            System.out.println("Dentro do intervalo");
        
        } else {
            System.out.println("Fora do intervalo");
        }

        scanner.nextLine();


        // Exericio 6
        System.out.println("Digite uma letra: ");

        char letra = scanner.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u':

            System.out.println("Vogal");
                
                break;
    
            default:
    
            System.out.println("Consoante");

            break;
        }

        scanner.close();
    }
}
