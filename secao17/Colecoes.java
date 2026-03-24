package secao17;

import java.util.*;

public class Colecoes {
    public static void main(String[] args) {

        // 1 - List
        List<String> listaNomes = new ArrayList<>();

        // Adicionar
        listaNomes.add("Luna");
        listaNomes.add("Luan");
        listaNomes.add("Lady");

        // Resgatar
        System.out.println("Primeiro nome: " + listaNomes.get(0));
    
        // Alterar
        listaNomes.set(1, "Vitória");

        System.out.println("Segundo nome: " + listaNomes.get(1));

        // Remover el
        listaNomes.remove(2);

        // Procura por valor de item
        System.out.println(listaNomes.contains("Teste"));
        
    }
}