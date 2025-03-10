package secao5;

public class FuncoesBuiltIn {
    public static void main(String[] args) {
        
        // 10 - Funções built in de string
        String frase = "Java é legal";

        //length
        System.out.println(frase.length());

        // int => inteiro
        // String => letra maiuscula inicial => clase

        System.out.println(frase.substring(0, 4));

        System.out.println(frase.toUpperCase());

        System.out.println(frase.replace("a", "e"));

        String fraseMudada = frase.toUpperCase();

        System.out.println(fraseMudada);

        System.out.println(frase.toLowerCase());

        // 11 - Funções built in de numeros
        System.out.println(Math.sqrt(26));
        System.out.println(Math.sqrt(6));

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.abs(-10));

        System.out.println(Math.max(100, 10));

        double raizQuadrada = Math.sqrt(99);

        System.out.println(raizQuadrada);

    }
}
