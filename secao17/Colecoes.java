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
        
        // LinkedList
        List<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        System.out.println(numeros.get(3));

        numeros.remove(0);

        // Ver os valores facilmente
        System.out.println(numeros.toString());

        numeros.set(0, 11);

        System.out.println(numeros.get(0));

        // As collections tem os mesmos métodos
        // mas nem todas, podem aplicá-los
    }
}