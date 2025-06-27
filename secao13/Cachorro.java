package secao13;
                      //extends significa que é uma classe filha
public class Cachorro extends Animal {
    
    // é obrigado a usar propriedades da classe pai
    public Cachorro(String nome) {
        super(nome);
    }

    public void latir() {
        System.out.println(nome + " está latindo");
    }
}
