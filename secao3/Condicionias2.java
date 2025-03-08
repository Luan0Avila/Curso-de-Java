package secao3;

public class Condicionias2 {
    public static void main(String[] args) {
    
        // 1 - Condicional ternária
        int numero = 10;

        String resultado = (numero % 2 == 0) ? "par" : "impar";

        System.out.println(resultado);

        // Condição x > 5 ? expressão se é true "ok" : expressão se é false "não ok"
    
        // 2 - if encadeado
        int idade = 25;
        boolean temCarteira = true;
    
        if (idade >= 18) {

            if (temCarteira) {
                System.out.println("Pode dirigir");
            } else {

                System.out.println("Precisa de carteira");

            }
            
        } else {
            
            System.out.println("Voce não pode dirigir ainda");
        }

        // 3 - Precedencia
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // TRUE AND FALSE -> FALSE OR TRUE -> TRUE
        boolean resultado2 = a && b || c;

        System.out.println(resultado2);
        
        // TRUE OU FALSE -> TRUE AND TRUE -> TRUE
        boolean resultado3 = a || b && c;

        System.out.println(resultado3);

        // NOT (TRUE OU FALSE) -> NOT(TRUE) -> FALSE AND TRUE -> FALSE
        boolean resultado4 = !(a || b) && c;

        System.out.println(resultado4);

        boolean resultado5 = (!a || b) && c;

        // (NOT TRUE OR FALSE) AND TRUE
        // (FALSE OR FALSE) AND TRUE
        // FALSE AND TRUE
        // FALSE
    
        System.out.println(resultado5);
    }
}
