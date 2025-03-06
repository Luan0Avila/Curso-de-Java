package secao3;

public class Condicionais {
    
    public static void main(String[] args) {
        
        // 1 - o que é boolean
        boolean isTrue = true;
        boolean isFalse = false;
        
        System.out.println(isTrue);
        System.out.println(isFalse);
        
        // 2 - Operadores de comparação
        int x = 10;
        
        System.out.println(x == 10);
        
        System.out.println(x == 9);

        System.out.println(x != 5);

        System.out.println(x > 10);

        System.out.println(x >= 10);

        System.out.println(x < 10);

        System.out.println(x <= 10);

        // 3 - atribuição e comparação
        int n = 5;
        int m = 10;

        System.out.println(n == 12);

        System.out.println(n);

        System.out.println(n == m);

        // 4 - comparação de strings
        String str1 = "Java";
        String str2 = "Java";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);

        System.out.println(str1.equals(str2));

        System.out.println(str2.equals(str1));

        System.out.println(str1.equals("Java"));

        // Java == JAVA (false) > Java == Java
        System.out.println(str1.equalsIgnoreCase(str2));

        // 5 - If
        int numero = 10;

        if (numero > 5) {
            System.out.println("O numero é maior que 5");
        }

        //if com strings
        String texto = "Teste";

        if (texto.equals("Teste")) {
            System.out.println("O texto é teste");
        }

        // declaração do if (comparação ou retorno de booleano) {o que será executado...}


        // 6 - else
        int q = 7;

        if (q > 10) {
            System.out.println("Q é maior que 10");
        } else {
            System.out.println("Insira um numero maior que 10");
        }


        if (texto.equals("Teste2")) {
            System.out.println("O texto é teste");
        } else {
            System.out.println("O texto não é igual!");
        }


        // 7 - else if
        double nota = 8.5;

        if (nota == 10) {
            System.out.println("Voce tirou a nota maxima");        
        } else if (nota >= 9) {
            System.out.println("Muito boa!");
        } else if (nota >= 7) {
            System.out.println("Acima da média");
        } else {
            System.out.println("Abaixo da média");
        }
    
        int num = 5;

        if (num > 3) {
            System.out.println("Alguma coisa");
        } else if (num == 5); {
        System.out.println("Outra coisa");
        }
    // 1 - Vou escolher qual a condição que eu quero que mais ocorra
    // 2 - melhorar a lógica
    if (num > 3 && num < 5) {
        System.out.println("Alguma coisa");
    } else if (num == 5); {
    System.out.println("Outra coisa");
    }

    // 8 - AND

    
    }

}
