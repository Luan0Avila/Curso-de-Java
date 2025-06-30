package secao13;

interface Pagamento{
    
    // método bastrato
    void processarPagamento(double valor);

    //método com default
    default void exibirRecibo(double valor) {
        System.out.println("Recibo do pagamento, com valor de R$" + valor);
    }
}
