package secao13;

public class Cartao implements Pagamento {
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + ", via cartão de crédito");
    }
}
