package secao5;

public class Exercicios {
    public static void main(String[] args) {
        
        // Exercicio 1 
        double conversao = celciusToFahrenheit(25.0);

        System.out.println(conversao);


        // Exercicio 2
        System.out.println(fatorial(10));


        // Exercicio 3
        System.out.println(parOuImpar(4));
        System.out.println(parOuImpar(5));
    
    
        // Exercicio 4
        System.out.println(nota(5));


        // Exercicio 5 
        verificarIdade(18);

        // Exercicio 6
        int[] numeros = {10,5,22,44,5};

        System.out.println(maiorNum(numeros));


    }


    
    public static double celciusToFahrenheit(double x) {
        return (x * 9/5) + 32;

    }

    public static int fatorial(int x) {

        if (x == 0 || x == 1) {
            return 1;
        } else {
            return x * fatorial(x -1);
        }
    }

    public static String parOuImpar(int x){

        if (x % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

    public static String nota(int x) {

        switch (x) {
            case 10, 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            case 5,4,3,2,1,0:
                return "F";
            default:
                return "Inválido";
        }
    }

    public static void verificarIdade(int idade){

        if (idade < 18) {
            System.out.println("Acesso negado!");
            System.exit(0);
        } else {
            System.out.println("Acesso permitido");
        }
    }

    public static int maiorNum(int[] x) {

        int maior = x[0];

        //Contador, cond. execução, Incremento
        for(int i = 1; i < x.length; i++) {
            if (x[i] > maior) {
                maior = x[i];
            }
        }
        return maior;
    }
}
