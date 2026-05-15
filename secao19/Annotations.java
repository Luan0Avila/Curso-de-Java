package secao19;

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


    }


    
}