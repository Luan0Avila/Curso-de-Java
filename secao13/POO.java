package secao13;

public class POO {
    public static void main(String[] args) {
        

        // 1 - Object Composition
        Motor motor1 = new Motor("V8", 450);
    
        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();

        // 2 - Herança
        Cachorro cao1 = new Cachorro("Poca");

        cao1.latir();
        cao1.emitirSom();

        Animal leao = new Animal("Lião");

        leao.emitirSom();

        // a subclasse tem acesso a tudo da superclasse
        // mas o contrário não é verdade 

        // 3 - Classe Object
        Pessoa luan = new Pessoa("Luan",20);
        Pessoa luna = new Pessoa("Luna",0);

        System.out.println(luan.toString());
        System.out.println(luan.equals(luna));

        // 4 - Overrride
        Quadrado q1 = new Quadrado(4);

        Circulo c1 = new Circulo(3.2);

        System.out.println(q1.calcularArea());
        System.out.println(c1.calcularArea());

        // 5 - super
        Funcionario funcionario = new Funcionario("Carlos",3000);

        Gerente gerente = new Gerente("Marcos",5000,1000);


        gerente.exibirDetalhes();
        funcionario.exibirDetalhes();

        System.out.println(funcionario.calcularBonus());
        System.out.println(gerente.calcularBonus());

        // 6 - abstract
        Instrumento violao = new Violao("violão");
        Instrumento bateria = new Bateria("bateria");

        violao.exibirDetalhes();
        bateria.exibirDetalhes();

        violao.tocar();
        bateria.tocar();

        // 7 - Interface
        Pagamento cartao = new Cartao();
        Pagamento transf = new Transferencia();
    
        cartao.processarPagamento(100);
        cartao.exibirRecibo(100);

            transf.processarPagamento(100);
            transf.exibirRecibo(100);
    
    }
}
