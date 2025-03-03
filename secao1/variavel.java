package secao1;

public class variavel {

    public static void main(String[] args) {
        
        // 1 - O que são variáveis
        // tipo -> nome -> atribuir um valor
        String nome = "Luan";

        System.out.println(nome);

        // 2 - Atribuição de variável com outra
        String teste = "Teste";

        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 9999999999999L;

        System.err.println(numeroGrande);

        // 3 - Comentários

        /*
        Comentário linha 1
        linha 2
        linha 3
         */

        /**
         * Comentário de documentação
         * 
         * 
         * 
         * 
         * */

        // 4 - Strings

        String firstName = "Luan";
        String lastName = "Avila";

        System.out.println(firstName + " " + lastName);

        System.out.println("O nome dele é " + firstName + " " + lastName);

        String fullName = firstName + " " + lastName;

        //concatenação = operador + nas strings, para uni-las
        System.out.println(fullName);

        // 5 - Char

        char letra = 'a';

        System.out.println(letra);

        String letra2 = "A";

        System.out.println(letra2);

        char simbolo = '$';

        System.out.println(simbolo);

        // 6 - Int

        int n = 42;

        System.out.println(n);
        
        System.out.println(n + 5);
        
        System.out.println(n * 5);

        System.out.println(n / 5);

        int soma = n + 12;

        System.out.println(soma);

        // 7 - Long

        long populacaoMundial = 78000000000L;

        System.out.println(populacaoMundial);

        long grandeNumero = 1_000_000L;

        System.out.println(grandeNumero + 1);

        // 8 - Double 

        double preco = 19.99;
    
        System.out.println(preco);

        System.out.println(preco - 12);

        System.out.println(preco / 2);

        double pi = 3.14141_592_123;

        System.out.println(pi);

        double valorComD = 12.1D;

        System.out.println(valorComD);

        // 9 - Op. aritmeticos p1

        int soma2 = 12 + 5;

        System.out.println(soma2);

        System.out.println(22 + 4);

        System.out.println(10 - 5);

        System.out.println(10 * 5);

        System.out.println(10 / 5);

        System.out.println(10 / 2.5);

        // para ter um resultado quebrado, pelo menos um numero da divisão precisa ser double

        System.out.println(10 / 3);

        System.out.println(10.0 / 3);

        System.out.println(10 % 3);


        // 10 - Op aritmeticos p2

        int x = 5;

        x++;
        x++;
        x++;
        x++;
        x++;

        System.out.println(x);

        int y = 5;

        y--;

        System.out.println(y);

        int a = 10;

        a += 5;

        System.out.println(a);

        int b = 10;

        b -= 5;

        System.out.println(b);

        b -= a;

        System.out.println(b);

        // 11 - Type casting

        // implicito (widening)
        int numero2 = 42;

        long numeroGrande2 = numero2;

        double numeroDouble = numero2;

        System.out.println(numeroGrande2);

        System.out.println(numeroDouble);

        // explicito (narrowing)

        double valorDouble = 9.78;

        int valorInt =  (int) valorDouble;

        System.out.println(valorInt);

        // casting de char para int

        char letra3 = 'A';

        int codigoAscii = (int) letra3;

        System.out.println(codigoAscii);


        // 12 - Constantes
        final int DIAS_DA_SEMANA = 7;

        System.out.println("Dias da semana: " + DIAS_DA_SEMANA);

        // 13 - Var

        var z = 10;

        System.out.println(z);

        //z = 'teste';
        
        z = 5;

        var texto = "teste";

        var doubleTeste = 2.00;

        System.out.println(texto);

        System.out.println(doubleTeste);

        

    }
}