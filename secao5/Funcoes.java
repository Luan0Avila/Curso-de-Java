package secao5;

public class Funcoes {
    
    public static void main(String[] args) {
        
        // 1 - Criando a primeira função
    
        saudacao();

        // 2 - Parametros
        soma(2, 4);
        soma(3, 10);
        
        // 3 - Reuturn
        saudar("Luan");

        int numero = 10;
        int numero_dobrado = dobrar(numero);

        
        System.out.println(numero_dobrado);

        System.out.println(dobrar(numero_dobrado));

        // 4 - Retorno em váriavel
        String r1 = verificarPar(numero);

        String r2 = verificarPar(3);

        System.out.println(r1);
        System.out.println(r2);

        int x = dobrar(soma2(2, 4));
        System.out.println(x);

    }

    //NIVEL DE ACESSO, STATIC => Não preciso instanciar classe para executar, TIPO RETORNO
    //NOME, OS PARENTESE (ARGS), BLOCO {}
    public static void saudacao() {

        System.out.println("Olá, esta é minha primeira função");
    }

    public static void soma(int a, int b) {

        int resultado = a + b;
        System.out.println(resultado);

    }

    public static void saudar(String nome) {

        System.out.println("Olá " + nome);
    }

    public static int dobrar(int n) {
        return n * 2;
    }

    public static String verificarPar(int n) {

        if (n % 2 == 0) {
            return "O numero " + n + " é par";
        } else {
            return "O numero " + n + " não é par";
        }
    }

    public static int soma2(int a, int b) {
        return a + b;
    }

}
