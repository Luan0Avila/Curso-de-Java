package secao19;

import java.lang.reflect.Field;

public class Annotations {

    public static void main(String[] args) {
        
        // 1 - annotations pre definidas
        Cachorro cachorro = new Cachorro();

        cachorro.emitirSom();
        cachorro.testemover();

        // 2 - Annotation customizada
        Exemplo exemplo = new Exemplo();

        // anotações geralmente precisam de try catch

        // loop em cada um dos métodos
        for(var metodo : exemplo.getClass().getDeclaredMethods()) {
            System.out.println(metodo);
            
            // verifica se a anotação está presente no método
            if (metodo.isAnnotationPresent(Executar.class)) {
                
                // resgatar ql é a annotatio
                Executar anotacao = metodo.getAnnotation(Executar.class);

                // loop baseado em quantaas vezes ele tem que executar
                for(int i = 0; i < anotacao.vezes(); i++) {

                    // invoco o método
                    try{
                        metodo.invoke(exemplo);
                    } catch(Exception e) {
                        System.out.println("Erro:" + e.getMessage());
                    }
                }
            }
        }

        // 3 - annotation para validar campos
        User user = new User("","teste@email.com");
        validarCampos(user);

        User user2 = new User("","");
        validarCampos(user2);
        

    }


    // função para validar campos anotados
    public static void validarCampos(Object objeto) throws IllegalArgumentException {

        // Pegar a classe, pegar os campos, verificar se eles tem annotation

        Class<?> classe = objeto.getClass();

        for(Field campo : classe.getDeclaredFields()) {

            if(campo.isAnnotationPresent(NotEmpty.class)) {

                // saber o valor de message de cada campo
                NotEmpty anotacao = campo.getAnnotation(NotEmpty.class);

                // ativar a acessibilidade do campo privado
                campo.setAccessible(true);

                try {
                    Object valor = campo.get(objeto);

                    // validar o campo
                    if(valor == null || valor.toString().isEmpty()) {
                        System.out.println(anotacao.message());
                    }

                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            }
        }
    }


    
}