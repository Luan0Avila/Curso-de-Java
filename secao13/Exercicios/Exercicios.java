package secao13.Exercicios;

public class Exercicios {
    public static void main(String[] args) {
        
        // exercicio 1
        Endereco endereco = new Endereco("teste", 000,"tururum");

        Pessoa pessoa1 = new Pessoa("Luna", 1, endereco);

        pessoa1.exibirInfo();
    
    }
}
