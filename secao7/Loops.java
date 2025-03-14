package secao7;

public class Loops {
    public static void main(String[] args) {
        
        // 1 - For

        // loop que vai rodar de 1 a 5
        
        //Variavel de inicialização = i, j, k
        //Condição -> determina quantas vezes o loop vai rodar
        // incremento -> a variavel vai chegar na condição
        for(int i = 1; i <= 5; i++) {
            //repetir
            System.out.println(i);
        }

        //mostrar cada caracter de uma String
        String palavra = "Java";

        for(int i = 0; i < palavra.length(); i++) {

            System.out.println(palavra.charAt(i));
        }

        //Contagem regressiva
        for(int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // 2 - While
        int i = 0;
        while (i <= 5) {
            System.out.println("While contador: " + i );
            i++;
        }

        int valor = 0;

        while (valor != 7) {
            
            valor = (int)(Math.random() * 10);

            System.out.println("Valor aleatório: " + valor);
        }
        
        // 3 - loop infinito
        //while (true) {
            //System.out.println("Infinito");
        //}
    
        // 4 - Do while

        int j = 10;

        do {

            System.out.println("j = " + j);

            j --;
        } while(j > 0);

        int numero = 0;

        do {
            numero = (int)(Math.random() * 10);

            System.out.println("aleatório: " + numero);
        } while(numero != 1); 
    
        // 5 - Break em loops
        
        //break pode ser usado em qualquer loop

        for(int x=0; x <= 10; x++) {
            System.out.println("x = " + x);

            if (x == 5) {
                System.out.println("parando");
                break;
            }
        }

        // 6 - Continue

        for(int x = 10; x>0; x--) {
            
            if (x % 2 == 0) {
                System.out.println("par!");
                continue;
            }
            // quando ele pula isso não é executado
            System.out.println("contatodor = " + x);
        }

        // 7 - Nested loops

        for(int m = 1; m<= 3; m++) {
            System.out.println("externo");
            for(int n = 1; n <= 3; n++){

                System.out.println(m + " x " + n + " = " +(m*n));
            }
        }

        //Padrão de estrelas
        for(int o = 1; o <= 5; o++) {

            for(int p = 1; p <= 0; p++) {
                System.out.print("8");
            }
            System.out.println("*");
        }

    }
}
