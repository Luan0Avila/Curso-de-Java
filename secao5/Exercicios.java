package secao5;

public class Exercicios {
    public static void main(String[] args) {
        
        // Exercicio 1 
        double conversao = celciusToFahrenheit(25.0);

        System.out.println(conversao);


        // Exercicio 2
        System.out.println(fatorial(10));


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
}
