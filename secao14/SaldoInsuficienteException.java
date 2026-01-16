package secao14;

// Toda classe que herda de Exception, tem que enviar pleo menos a msg
// getMessage -> menssagem
public class SaldoInsuficienteException extends Exception{
    
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}
