package secao3;

public class OperadoresLogicos {
    public static void main(String[] args) {
    
        // 8 - AND
        int idade = 18;
        boolean temCarteiraDeMotorista = true;

        //true == true > true (variavel)
        System.out.println(idade >= 18 && temCarteiraDeMotorista);
        System.out.println(idade >= 18 && temCarteiraDeMotorista == true);

        boolean carteiraVencida = true;

        System.out.println(idade >= 18 && temCarteiraDeMotorista && carteiraVencida == false);

        int a = 10;
        int b = 20;
    
        // True && True => True
        if (a > 5 && b > 10) {
            System.out.println("Deu certo!");
        }

        // False && True => False (Curto circuito)
        if (a > 55 && b > 10) {
            System.out.println("Deu certo!");
        }

        // 9 - OR
        boolean estaChuvendo = true;
        boolean temGuardaChuva = true;

        System.out.println(estaChuvendo || temGuardaChuva);

        System.out.println(false || false);

        System.out.println(10 > 20 || 100 == 200);

        int idade2 = 16;
        boolean ehMebro = true;

        // O usuario pode participar do clube
        // ele precisa ter > 16 anos OU ser membro

        if (idade2 > 16 || ehMebro) {
            System.out.println("Voce pode entrar");
        } else {
            System.out.println("Entrada negada");
        }
    
    // 10 - NOT
        System.out.println(estaChuvendo);
        System.out.println(!estaChuvendo);
        
        System.out.println(estaChuvendo || !temGuardaChuva);

        System.out.println(!(estaChuvendo || !temGuardaChuva));
    }
}
