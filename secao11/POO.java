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

        // 5 - Setters
        ContaBancaria contaDoLuan = new ContaBancaria();

        contaDoLuan.setTitular("Luan");

        contaDoLuan.setSaldo(1000);

        contaDoLuan.exebirInfo();

        // 6 - Getters
        System.out.println(contaDoLuan.getTitular());

        System.out.println(contaDoLuan.getSaldo());

        // 7 - Logica no Getter e Setter
        Produto camisa = new Produto();
    
        camisa.setNome("Camisa Regata");

        System.out.println(camisa.getNome());

        camisa.setPreco(29.99999);

        System.out.println(camisa.getPreco());

        // 8 - Método dentro de método
        System.out.println(camisa.getProdutoInfo());

        camisa.aplicarDesconto(10);

        // 9 - Construtores
        Livro livro = new Livro("Harry Potter", "JK Rowlling", 16.99);

        livro.exibirInfo();

        Livro livro2 = new Livro();

        livro2.exibirInfo();


        // 10 - Niveis de acesso
        Funcionário funcionário1 = new Funcionário("Luan",2500,"teste123@");

        funcionário1.exibirDados();

        funcionário1.nome = "Teste";
        funcionário1.salario = 1500;
        //funcionário1.senha = "teste321"; senha é private

        funcionário1.exibirDados();

        funcionário1.aumentarSalario(10);

        //System.out.println(funcionário1.tentarSenha());
        System.out.println(funcionário1.autenticar("teste123@"));
        System.out.println(funcionário1.autenticar("teste12"));
    
        // 11 - Classe imutavel
        PessoaImutavel joaquim = new PessoaImutavel("Joaquim", 23);

        System.out.println(joaquim.getNome());
        System.out.println(joaquim.getIdade());

        //joaquim.nome = "teste";
    }    
}
