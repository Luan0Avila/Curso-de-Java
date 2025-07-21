package secao13.Exercicios;

public class Hidroaviao extends Barco implements Pilotavel{
    
    @Override
    public void pilotar() {
        System.out.println("o hidroaviao está sendo pilotado e depois vai navegar");
    }
}
