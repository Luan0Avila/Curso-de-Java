package secao13;

public class Bateria extends Instrumento {
    
    public Bateria(String nome) {
        super(nome);
    }

    @Override
    public void tocar() {
        System.out.println("Batendo nos tambores da " + nome);
    }
}
