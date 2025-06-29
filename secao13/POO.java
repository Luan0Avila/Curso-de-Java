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
    }
}
