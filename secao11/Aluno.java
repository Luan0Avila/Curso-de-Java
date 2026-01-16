package secao11;

public class Aluno {
    
    private String nome;
    private double notaFinal;

    public void Aluno(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("nome não pode estar vazio!");
        }
    }

    public double getNotaFinal() {
        return notaFinal;
    }
    
    public void setNotaFinal(double notaFinal) {

        if (notaFinal >= 0 && notaFinal <= 100) {
            this.notaFinal = notaFinal;
        } else {
            System.out.println("nota não pode ser menor que 0 e maior que 100!");
        }
    }

    public void exibirInfo() {
        System.out.println("O Aluno: " + nome + " Teve a nota final de: " + notaFinal);
    }
}
