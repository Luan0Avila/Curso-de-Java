package secao13;

public class Violino extends Instrumento {
    
    public Violino(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando  o " + nome);
    }
}
