package secao10;

import java.util.Scanner;
import java.util.Arrays;


public class JogoDaForca {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        //Definir a palavra secreta
        String palavraSecreta = "JAVA";

        char[] palavraOculta = new char[palavraSecreta.length()];

        for(int i = 0; i < palavraSecreta.length(); i++) {
            palavraOculta[i] = '_';
        }

        System.out.println(Arrays.toString(palavraOculta));

        //numero maximo de tentativas
        int tentativas = 6;
        boolean venceu = false;

        // Loop que solicita as letra para o usuário
        while (tentativas > 0) {
            
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas  restantes: " + tentativas);
            System.out.println("Digite um letra: ");

            char letra = scanner.next().toUpperCase().charAt(0);

            System.out.println(letra);

            boolean acertou = false;

            for(int i = 0; i < palavraSecreta.length(); i++) {

                if (palavraSecreta.charAt(i) == letra) {
                    palavraOculta[i] = letra;
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas --;
                System.out.println("Letra incorreta.");
            } else {
                System.out.println("Letra Correta");
            }
            System.out.println(String.valueOf(palavraOculta));

            if (String.valueOf(palavraOculta).equals(palavraSecreta)) {
                venceu = true;
                break;
            }
        
            
        }
        //condição de vitória
        if (venceu) {
            System.out.println("Parabens voce venceu, restaram " + tentativas + "  tentativas!");
        } else {
            System.out.println("Voce Perdeu! ");
        }
        
        System.out.println("A palavra era: " + palavraSecreta);
        scanner.close();
    }    
}
