package secao13.Exercicios;

public class Animal {
    
    protected String nome;
    protected String som;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
    }

    public void emitirSom() {
        System.out.println("O " + nome + " está emitindo um " + som);
    }
}
