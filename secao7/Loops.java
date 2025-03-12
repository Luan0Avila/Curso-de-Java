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
    while (true) {
        System.out.println("Infinito");
    }
    }
}
