package secao13.avancando;

public class POO2 {
    public static void main(String[] args) {
        
        // 1 - classes com final
        Conta conta = new Conta(1000);
        // não podemos extender classes com final
        System.out.println("Saldo: " + conta.getSaldo());

    }
}
