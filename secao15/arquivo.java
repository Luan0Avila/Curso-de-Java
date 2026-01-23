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
            
        // 2 - Escrever em arquivos
        try (FileWriter writer = new FileWriter(currentDir + "saida.txt")) {
            
            writer.write("Escrevendo em arquivo \n");
            writer.write("Escrevendo em arquivo 2");

        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());        
        }
    
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt"))) {
            
            writer.write("Escrevendo em arquivo com BufferedWriter \n");
            writer.newLine();
            writer.write("Escrevendo em arquivo 2 com BufferedWriter");

        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());   
        }

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentDir + "saida2.txt", true))) {
            
            writer.append("testando");

        } catch (Exception e) {
            System.out.println("Erro ao escrever arquivo: " + e.getMessage());   
        }
    }
}
