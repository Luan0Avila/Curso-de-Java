package secao14;

public class Erros {
    public static void main(String[] args) {
        
        // 1 - try catch
        try {
            int a = 0;
            int b = 0;

            int resultado = b / a;
            System.out.println(resultado);

        } catch(ArithmeticException e) {
            
            System.out.println("Divisão por 0 não é possivel");
        }

        try {
            int[] numeros = {1,2,3};

            System.out.println(numeros[3]);

        } catch (Exception e) {
            System.out.println("Erro genérico");
            
            System.out.println("Msg:" + e.getMessage());
        }

    }
}
