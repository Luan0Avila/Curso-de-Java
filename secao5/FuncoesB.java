package secao5;

public class FuncoesB {

    static int globalVar = 11;
    public static void main(String[] args) {
        
        // 5 - funçoes com condicionais
        String r1 = verificarAcesso(19, true, true);

        System.out.println(r1);

        // 6 - Funçoes com switch
        System.out.println(obtendoDiaDaSemana(4));

        System.out.println(obtendoDiaDaSemana(1));

        // 7 - System.exit
        verficarAutenticacao("admin", "SenhaSegura");

        System.out.println("oi");
    
        // 8 - Documentação função
        System.out.println(calcularMedia(5, 6, 7));

        // 9 - Escopo

        //escopo local
        int localVar = 10;

        if (true) {
            System.out.println(localVar);
        }

        System.out.println(globalVar);

        int testeFuncaoEscopo = escopoLocal(localVar);
    
        System.out.println(testeFuncaoEscopo);

        // { } => geralmente delimitam um escopo, cria um escopo

        

    
    }

    public static String verificarAcesso(
        int idade,
        boolean temCarteira,
        boolean temHistoricoNegativo) {

            if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
                return "Acesso permitido: todos os critérios atendidos!";

            } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
                return "Acesso negado: Histórico negativo detectado";

            } else {
                return "Acesso negado: Critérios não atendidos!";

            }
    }

    public static String obtendoDiaDaSemana (int dia) {

        switch (dia) {
            case 1:
                return "Segunda-feira";
                case 2:
                    return "Teça-feira";
                case 3:
                    return "Quarta-feira";
                case 4:
                    return "Quinta-feira";
                case 5:
                    return "Sexta-feira";
                case 6:
                    return "Sabado";
                case 7:
                    return "Domingo";
                default:
                    return "Numero inválido";
                
        }
    }

    public static void verficarAutenticacao(String usuario, String senha) {

        if (!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
            System.out.println("Autenticação falhou!");
            System.exit(1);
        }

        System.out.println("Autenticação bem sucedida");
    }

    /**
     * 
     * Calcula a média de tres numeros inteiros
     * @param n1 O primeiro numero a ser enviado
     * @param n2 O segundo numero a ser enviado
     * @return n3 O terceiro numero a ser enviado
     */
    public static double calcularMedia(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static int escopoLocal(int a) {
        System.out.println(globalVar);
        System.out.println(a);
    
        int testeFuncao = 1;

        return testeFuncao;
    }
}
