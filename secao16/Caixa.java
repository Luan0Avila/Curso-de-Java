package secao16;

// T -> não é alguma coisa, é qualquer coisa
public class Caixa<T> {
    
    private T couteudo;

    public void adicionar(T conteudo) {
        this.couteudo = conteudo;
    }

    public T obter() {
        return couteudo;
    }

}
