package secao14;

    import java.io.*;
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

        // 3 - exceções com throw
        try {
            validarIdade(21);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    
    }

    public static void validarIdade(int idade) {

        if (idade < 18) {
            throw new IllegalArgumentException("Idade deve ser maior que 18.");
            
        }
        System.out.println("Idade válida " + idade);
    
        // 4 - Excessões personalizadas
        Banco minhaConta = new Banco(1000);

        try {
            minhaConta.sacar(2000);
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
        
        //  - verificadas e não verificadas


        // verificadas

        try {
            BufferedReader reader = new BufferedReader(new FileReader("arquivo.txt"));
            String linha = reader.readLine();
            System.out.println(linha);
            reader.close();
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        // não verificadas
        //String texto = null;

        //System.out.println(texto.length());


        // 5 - trhows em métodos

        try {
            processarArquivos("teste");
        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        
    }

    public static void processarArquivos(String caminho) throws FileNotFoundException, IOException {

        if (caminho == null || caminho.isEmpty()) {
            throw new IOException("Caminho não encontrado");
        }

        File arquivo = new File(caminho);

        if (!arquivo.exists()) {
            throw new FileNotFoundException("Arquivo não encontrado");
        }

        System.out.println("arquivo encontrado com sucesso");
    }
}
