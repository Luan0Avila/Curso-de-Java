package secao13;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Override = sobrescrita
    // Isto não é uma boa pratica
    @Override
    public String toString() {
        return "Nome: " + nome + ", idade: " + idade;
    }
}
