package secao11;

public class Pessoa {

    private String nome;
    private int idade;

    public void setNome(String nome) {
        //THIS -> OBJETO
        //this = este objeto
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
