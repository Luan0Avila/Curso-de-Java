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


        // - 2 - Set
        // HashSet - Reordena os elementos
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("PHP");
        conjunto.add("Java");

        System.out.println(conjunto);
        System.out.println(conjunto.contains("PHP"));

        //LinkedHashSet - Mantem a ordem dos elementos
        Set<Integer>numero2 = new LinkedHashSet<>();

        numero2.add(5);
        numero2.add(11);
        numero2.add(6);
        numero2.add(510);

        System.out.println(numero2);

        // TreeSet - Reordena os elementos
        Set<String> nomes = new TreeSet<>();

        nomes.add("Luna");
        nomes.add("Luan");
        nomes.add("Lady");

        System.out.println(nomes);
        // o método get não está no Set


        // 3 - map

        // Hashmap

        Map<String, Integer> idadeMap = new HashMap<>();

        idadeMap.put("Luna", 9);
        idadeMap.put("Luan", 21);
        idadeMap.put("Lady", 21);
        
        System.out.println(idadeMap);
        
        // map com chave já existente atualiza o valor
        idadeMap.put("Luan", 22);
        System.out.println(idadeMap);

        System.out.println("Idade da Luna: " + idadeMap.get("Luna"));

        idadeMap.remove("Luan");

        System.out.println(idadeMap.containsKey("Luna"));
        System.out.println(idadeMap.containsValue(11));

        System.out.println(idadeMap.entrySet());

        // LinkedHasMap
        Map<String, String> capitalMap = new LinkedHashMap<>();

        capitalMap.put("Brasil", "Brasilia");
        capitalMap.put("Argentina", "Buneos Aires");
        capitalMap.put("França", "Paris");

        System.out.println(capitalMap.entrySet());

        System.out.println(capitalMap.containsKey("Brasil"));

        // TreeMap - reordena os itens

        Map<String, Double> prodPrecoMap = new TreeMap<>();

        prodPrecoMap.put("Maçã", 3.50);
        prodPrecoMap.put("Pera", 5.00);
        prodPrecoMap.put("Leite", 9.10);

        System.out.println(prodPrecoMap);
    }
}