package secao13.Exercicios;

public class Cacchorro extends Animal{

    private String raca;
    
    public Cacchorro(String nome, String som, String raca) {
        super(nome, som);
        this.raca = raca;
    }

    public void detalhes() {
        System.out.println("Nome: " + nome + ", raça: " + raca + ", som: " + som);
    }
}
