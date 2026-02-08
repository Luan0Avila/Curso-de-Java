package secao16;

public class Generics {
    
    public static void main(String[] args) {
        

        // 1 - classes genéricas

        // quando o objeto for instanciado o T se torna ALGUMA COISA
        Caixa<Integer> caixaInteira = new Caixa<>();

        caixaInteira.adicionar(100);

        //caixaInteira.adicionar("teste");
        
        System.out.println(caixaInteira.obter());

        Caixa<String> caixaStr = new Caixa<>();

        caixaStr.adicionar("teste");

                System.out.println(caixaStr.obter());
    }
}
