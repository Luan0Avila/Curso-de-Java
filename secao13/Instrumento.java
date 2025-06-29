package secao13;

abstract class Instrumento {
    
    protected String nome;

    public Instrumento(String nome) {
        this.nome = nome;
    }

    //abstrato: tem que ser implementado na subclasse
    public abstract void tocar();

    //concreto: pode ser herdado
    public void exibirDetalhes(){
        System.out.println("Instrumento: " + nome);
    }
}
