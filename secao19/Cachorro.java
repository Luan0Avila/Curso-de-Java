package secao19;

public class Cachorro extends Animal{
    
    @Override
    public void emitirSom() {
        System.out.println("O cachorro está latindo");
    }

    // warning não para a compilação
    // erro (vermelho) não compila
    @SuppressWarnings("deprecation")
    public void testemover() {
        mover();
    }

}
