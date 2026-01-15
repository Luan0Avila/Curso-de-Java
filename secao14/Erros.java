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
            // Excessão e erro => para o mesmo fim
        }

        // 2 - finally
        try {
            int[] numeros = {1,2,3};

            System.out.println(numeros[3]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro genérico finally");
            
            System.out.println("Msg:" + e.getMessage());
        } finally {
            System.out.println("Executou o finally");
        }



        try {
            int[] numeros = {1,2,3};

            System.out.println("Acessando indice existente");
            System.out.println(numeros[2]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro genérico finally");
            
            System.out.println("Msg:" + e.getMessage());
        } finally {
            System.out.println("Executou o finally");
        }



        try {
            int[] numeros = {1,2,3};

            System.out.println("Acessando indice sem catch");
            System.out.println(numeros[2]);

        } finally {
            System.out.println("Executou o finally");
        }
    }
}
