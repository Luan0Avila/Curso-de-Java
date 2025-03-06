package secao3;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço de um produto: ");
        double preco = scanner.nextInt();


        if (preco < 50) {

            System.out.println("Barato");
            
        } else if (preco >= 50 && preco <= 100) {
            System.out.println("Médio");
        } else {
            System.out.println("Caro");
        }

        scanner.close();
    }
}
