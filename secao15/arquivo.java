package secao15;

import java.io.*;

public class arquivo {
    public static void main(String[] args) {
        
        // 1 - Leitura de arquivo
        String currentDir = System.getProperty("user.dir") + "/secao15/";
        System.out.println(currentDir);


        // FileReader = caracter por caracter
        //BufferedReader = linha por linha

        try (FileReader reader = new FileReader(currentDir + "arquivo.txt")) {
            
            int caracter;
            
            while ((caracter = reader.read()) != -1) {
                System.out.print((char)caracter);
            }
            
        } catch (Exception e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(currentDir + "arquivo.txt"))) {
            
            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
            } catch (Exception e) {
                System.out.println("Erro ao ler arquivo: " + e.getMessage());
            }
            
        
    }
}
