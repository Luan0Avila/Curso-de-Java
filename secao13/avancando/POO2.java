package secao13.avancando;

import java.lang.reflect.*;;

public class POO2 {
    public static void main(String[] args) {
        
        // 1 - classes com final
        Conta conta = new Conta(1000);
        // não podemos extender classes com final
        System.out.println("Saldo: " + conta.getSaldo());

        // 2 - Reflection API
        try {
            Class<?> classePessoa = Class.forName("secao13.avancando.Pessoa");
            Constructor<?> constructor = classePessoa.getConstructor(String.class, int.class);

            Object pessoa = constructor.newInstance("Luan", 21);
            
            Method metodoDizerOla = classePessoa.getMethod("dizerOla");

            metodoDizerOla.invoke(pessoa);

            Field campoNome = classePessoa.getDeclaredField("nome");

            campoNome.setAccessible(true);
            
            campoNome.set(pessoa, "Luna");

            metodoDizerOla.invoke(pessoa);

        } catch (Exception e) {
            e.printStackTrace();

        }
        
    
    }
}
