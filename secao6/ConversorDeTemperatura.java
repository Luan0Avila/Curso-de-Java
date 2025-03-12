package secao6;
import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite para qual temperatura gostaria de converter:");
        System.out.println("1 - Celcius para Fahrenheit");
        System.out.println("2 - Farenheit para Celcius");
        int op = scanner.nextInt();

        switch (op) {
            case 1:
                System.out.print("Digite a temperatura em Celcius: ");
                double celcius = scanner.nextDouble();
                System.out.println(celcius + "C para " + celciusParaFarenheit(celcius) + "F");
                break;
        
            case 2:
                System.out.print("Digite a temperatura em Fahenheit: ");
                double fahrenheit = scanner.nextDouble();
                System.out.println(fahrenheit + "F para " + farenheitParaCelcius(fahrenheit) + "C");
            default:
            System.out.println("Opção invalida!");
                break;
        }
    
        scanner.close();
    }

    public static double celciusParaFarenheit(double x) {
        return x * 1.8 + 32;
    }

    public static double farenheitParaCelcius(double x) {
        return (x - 32) * 5/9;
    }
}
