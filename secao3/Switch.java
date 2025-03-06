package secao3;

public class Switch {
    public static void main(String[] args) {
        
        // 11 - switch case e break

        //  para validar dia da semana baseado no numero

        int diaDaSemana = 1;

        switch(diaDaSemana) {

            case 1:
            System.out.println("Domingo");
            break;

            case 2:
            System.out.println("Segunda-feira");
            break;

            case 3:
            System.out.println("Terça-feira");
            break;

            case 4:
            System.out.println("Quarta-feira");
            break;


        }

        // 12 - Default
        int n = 10;

        switch (n) {
            case 1:
                System.out.println("é 1");
                break;
            
            case 2:
            System.out.println("é 2");

            default:
                System.out.println("Numero não reconhecido");
            break;

        }

        // 13 - switch sem break

        switch (1) {
            case 1:
                System.out.println("Excutou 1");

            case 2:
                System.out.println("Excutou 2");
            
            default:
                System.out.println("Executou 3");
                
        }
    }
}
