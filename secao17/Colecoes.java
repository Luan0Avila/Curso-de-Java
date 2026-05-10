package secao17;

import java.util.*;
import java.util.stream.Collectors;

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

        // 4 - Iterando

        //for-each
        for(String nome : nomes) {
            System.out.println(nome);
        }

        // iterator
        Iterator<String> nomesIterator = nomes.iterator();

        // remover um elemento
        while ((nomesIterator.hasNext())) {
            
            String nome = nomesIterator.next();

            if (nome.equals("Luan")) {
                nomesIterator.remove();
            }
        }

        System.out.println(nomes);

        // ListIterator
        ListIterator<String> listIteratorNomes = listaNomes.listIterator();

        while (listIteratorNomes.hasNext()) {
            System.out.println("Nome: " + listIteratorNomes.next());
        }

                while (listIteratorNomes.hasPrevious()) {
            System.out.println("Nome: " + listIteratorNomes.previous());
        }

        // 5 - Collections imutaveis

        // criando lista imutavel
        List<String> listaMutavel = new ArrayList<>();

        listaMutavel.add("teste");
        listaMutavel.add("teste2");
    
        List<String> listaImutavel = Collections.unmodifiableList(listaMutavel);

        System.out.println(listaImutavel);

        // Não podemos adicionar novos elementos
        // listaImutavel.add("teste3");

        List<String> listaImutavel2 = List.of("item1", "item2", "item3");

        //listaImutavel2.add("item4");

        System.out.println(listaImutavel2);

        Set<Integer> listaImutavelSet = Set.of(1,2,3);

        // listaImutavelSet.add(4);

        System.out.println(listaImutavelSet);

        // 6 - Filter

        List<Integer> numerosFiltrados = numeros.stream()
                                                .filter(numero -> numero > 3)
                                                .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(numerosFiltrados);

        // 7 - busca

        // for
        int numeroParaEncontar = 4;
        boolean encontrou = false;

        for(Integer numero : numeros) {
            if (numero == numeroParaEncontar) {
                encontrou = true;
            }
        }

        System.out.println(numeros);

        System.out.println("Encontrou? " + encontrou);
    
        // contains
        String nomeBuscado = "Luna";
        boolean encontrou2 = nomes.contains(nomeBuscado);

        System.out.println(nomes);
        System.out.println("Encontrou o nome? " + encontrou2);

        // findAny
        Optional<Integer> qualquerNumero = numeros.stream().findAny();

        System.out.println(qualquerNumero);

        //findFirst
        Optional<Integer> primeiroNumero = numeros.stream().findFirst();

        System.out.println(primeiroNumero);

        Optional<Integer> primerioPar = numeros.stream().filter(num -> num % 2 == 0).findFirst();

        System.out.println(primerioPar);

        // 8 - Map

        // modificam a collection
        List<Integer> quadrados = numeros.stream()
                                            .map(n -> n*n)
                                            .collect(Collectors.toList());

        System.out.println(numeros);
        System.out.println(quadrados);

        List<String> nomesMaiusculos = nomes.stream()
                                            .map(String::toUpperCase)
                                            .collect(Collectors.toList());
    
        System.out.println(nomesMaiusculos);
    
        // 9 - modificação

        // adiciona novo el
        numeros.add(50);

        System.out.println(numeros);

        // remove elementos pelo valor
        numeros.remove(Integer.valueOf(3));

        System.out.println(numeros);

        // alterar todos os elementos
        numeros.replaceAll(numero -> numero * 3);

        System.out.println(numeros);

        numeros.add(201);
        numeros.add(205);
        numeros.add(208);

        System.out.println(numeros);
        //remoção baseada em condição
        numeros.removeIf(numero -> numero > 200);

        System.out.println(numeros);

        // 10 - reduce

        int soma = numeros.stream()
                            .reduce(0, (acumulador, numero) -> acumulador + numero);

        System.out.println(soma);
    
        String frase = nomes.stream()
                            .reduce("", (concatenador, nome) -> concatenador + " " + nome);
    
        System.out.println(frase);

    }
}