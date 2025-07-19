package secao13.Exercicios;

public class Exercicios {
    public static void main(String[] args) {
        
        // exercicio 1
        Endereco endereco = new Endereco("teste", 000,"tururum");

        Pessoa pessoa1 = new Pessoa("Luna", 1, endereco);

        pessoa1.exibirInfo();
    
        // exercicio 2
        Carro carro = new Carro();
        Moto moto = new Moto();

        moto.acelerar();
        carro.acelerar();
    }
}
