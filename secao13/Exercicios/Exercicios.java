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

        // exercicio 3 
        Cacchorro cacchorro = new Cacchorro("bob", "latido","salcicha");

        cacchorro.emitirSom();
        cacchorro.detalhes();

        // exercicio 4
        FuncionarioIntegral fIntegral = new FuncionarioIntegral("joquinha", 3000.00);

        System.out.println(fIntegral.calcularSalario());
        fIntegral.adicionarBeneficio("Agua");

        FuncionarioMeioPeriodo fMeioPeriodo = new FuncionarioMeioPeriodo("juliao",10,7);

        System.out.println(fMeioPeriodo.calcularSalario());
        fMeioPeriodo.adicionarBeneficio("salario todo dia 5");

        // exercicio 5
        Pilotavel hidroaviao = new Hidroaviao();
        Navegavel barco = new Barco();
        Pilotavel aviao = new Aviao();

        aviao.pilotar();
        barco.navegar();
        hidroaviao.pilotar();

        operarVeiculo(aviao);
        operarVeiculo(barco);
        operarVeiculo(hidroaviao);

    }

    public static void operarVeiculo(Object veiculo){

        if (veiculo instanceof Pilotavel) {
            System.out.println("Este veiculo é pilotavel");
        }

        if (veiculo instanceof Navegavel) {
            System.out.println("Este veiculo é navegavel");
        }
    }
}
