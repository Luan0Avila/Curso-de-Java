package secao13;

public class Transferencia implements Pagamento  {
    

        @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + ", via TED");
    }

        @Override
        public void exibirRecibo(double valor) {
            System.out.println("O valor de R$" + valor + " foi transferido para o banco");
        }
}
