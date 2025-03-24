package secao11;

public class POO {
    public static void main(String[] args) {
    
        // 1 - Cirar classe
        // criação de Carro.java
        
        // 2 - Instaciar a classe
        Carro fusca = new Carro();

        // Acessar props e metodos sintaxe:
        // NOMEOBJETO.PROP e NOMEOBJETO.METODO()
        fusca.marca = "VW";
        fusca.modelo = "Fusca";
        fusca.ano = 1964;

        fusca.acelerar();

        fusca.exebirInfo();

        Carro carro2 = new Carro();

        carro2.marca = "fiat";
        carro2.modelo = "Palio";
        carro2.ano = 2000;

        carro2.exebirInfo();

        // 3 - Métodos
        fusca.aumentarVelocidade(10);
        fusca.ligarMotor();

        fusca.aumentarVelocidade(10);
        fusca.aumentarVelocidade(10);
        fusca.aumentarVelocidade(10);

        // 4 - Criadno propriedades
        Pessoa joao = new Pessoa();

        joao.setNome("João");

        System.out.println("O nome é: " + joao.getNome());

        joao.setIdade(20);

        System.out.println("Ele tem: " + joao.getIdade());
    }    
}
