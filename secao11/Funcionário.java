package secao11;

public class Funcionário {
    
    public String nome;
    protected double salario;
    private String senha;

    public Funcionário(String nome, double salario, String senha) {
        this.nome = nome;
        this.salario = salario;
        this.senha = senha;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + "\nsalario: " + salario + "\nsenha: " + senha);
    }

    protected void aumentarSalario( double porcentagem) {
        this.salario += ((this.salario * porcentagem) / 100);
        System.out.println("O salário aumentou para " + salario);
    }

    private boolean verificarSenha(String tentarSenha) {
        return this.senha.equals(tentarSenha);
    }

    public boolean autenticar(String tenttivaSenha) {
        //outras logicas
        return verificarSenha(tenttivaSenha);
    }


}
